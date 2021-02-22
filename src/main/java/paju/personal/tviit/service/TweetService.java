package paju.personal.tviit.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import paju.personal.dto.TweetDto;
import paju.personal.tviit.persistence.model.Tweet;
import paju.personal.tviit.persistence.model.User;
import paju.personal.tviit.persistence.repository.TweetRepository;
import paju.personal.tviit.persistence.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class TweetService {

    private final TweetRepository tweetRepository;
    private final UserRepository userRepository;

    public List<Tweet> getAllUserTweets(String username){
        return tweetRepository.getAllTweetsByUsername(username);
    }

    public TweetDto createNewTweet(TweetDto dto){

        Tweet newTweet = Tweet.builder()
                .id(dto.getId())
                .text(dto.getText())
                .username(dto.getUsername())
                .timestamp(LocalDateTime.now())
                .build();

        tweetRepository.save(newTweet);

        return dto;
    }


}
