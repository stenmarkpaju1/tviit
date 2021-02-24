package paju.personal.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserDto {
    private UUID id;
    private String username;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String middleName;
}
