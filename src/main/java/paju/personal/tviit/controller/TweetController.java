package paju.personal.tviit.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import paju.personal.dto.TweetDto;
import paju.personal.tviit.persistence.model.Tweet;
import paju.personal.tviit.service.TweetService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Tag(name = "Tweet Controller")
public class TweetController {

    private final TweetService tweetService;

    @CrossOrigin
    @Operation(summary = "Get all user tweets")
    @GetMapping("/api/tweets/getAllUserTweets")
    public ResponseEntity<List<Tweet>> getAllUserTweets(String username){
        return ResponseEntity.ok(tweetService.getAllUserTweets(username));
    }

    @CrossOrigin
    @Operation(summary = "Create new tweet for user")
    @PostMapping("/api/tweets/create")
    public ResponseEntity<TweetDto> createNewTweet(@RequestBody TweetDto dto){
        return ResponseEntity.ok(tweetService.createNewTweet(dto));
    }

}
