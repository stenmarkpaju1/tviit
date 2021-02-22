package paju.personal.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {
    private UUID id;
    private String userName;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String middleName;
}
