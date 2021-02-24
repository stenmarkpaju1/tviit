package paju.personal.tviit.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
import paju.personal.dto.UserDto;
import paju.personal.tviit.persistence.model.User;
import paju.personal.tviit.persistence.repository.UserRepository;

import java.util.Map;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    private UserService userService;

    private UserRepository userRepository;

    private UserService userServiceMock;

    UUID CHARGER_ID = UUID.randomUUID();

    @BeforeEach
    public void setUp(){
        userServiceMock = mock(UserService.class);

        userRepository = mock(UserRepository.class);

        userService = new UserService(userRepository);
    }

    @Test
    public void createNewUser(){

        UserDto userDto = UserDto.builder()
                .id(CHARGER_ID)
                .username("Petsu")
                .emailAddress("abc@123.ee")
                .firstName("Peeter")
                .middleName("Juhan")
                .lastName("Maasikas")
                .build();

        User user = User.builder()
                .id(CHARGER_ID)
                .username(userDto.getUsername())
                .emailAddress(userDto.getEmailAddress())
                .firstName(userDto.getFirstName())
                .middleName(userDto.getMiddleName())
                .lastName(userDto.getLastName())
                .build();



        when(userRepository.findUserByUsername(any())).thenReturn(user);


        userService.createNewUser(userDto);

        verify(userRepository, times(1)).save(any());
    }
}
