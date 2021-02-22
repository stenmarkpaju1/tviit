package paju.personal.tviit.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import paju.personal.tviit.persistence.model.Tweet;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Id> {

    List<Tweet> getAllTweetsByUsername(String username);
}
