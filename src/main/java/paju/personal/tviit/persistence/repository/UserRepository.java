package paju.personal.tviit.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import paju.personal.dto.UserDto;
import paju.personal.tviit.persistence.model.Tweet;
import paju.personal.tviit.persistence.model.User;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Id> {

    User findUserByUsername(String username);
}
