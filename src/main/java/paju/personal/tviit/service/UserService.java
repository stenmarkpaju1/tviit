package paju.personal.tviit.service;

import liquibase.pro.packaged.U;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import paju.personal.dto.UserDto;
import paju.personal.tviit.persistence.model.User;
import paju.personal.tviit.persistence.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserByUsername(String username){
        return userRepository.findUserByUsername(username);
    }

    public UserDto createNewUser(UserDto dto){

        User user = User.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .middleName(dto.getMiddleName())
                .lastName(dto.getLastName())
                .emailAddress(dto.getEmailAddress())
                .username(dto.getUserName())
                .build();

        userRepository.save(user);
        return dto;
    }

    public User deleteUser(String username){
        User user = userRepository.findUserByUsername(username);

        userRepository.delete(user);

        return user;
    }
}
