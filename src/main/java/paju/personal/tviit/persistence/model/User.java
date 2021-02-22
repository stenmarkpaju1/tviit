package paju.personal.tviit.persistence.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

import java.util.UUID;

@Data
@Entity
@Table(name = "user", schema = "public")
@IdClass(User.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Id
    @Column(name = "email_address")
    private String emailAddress;

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

}
