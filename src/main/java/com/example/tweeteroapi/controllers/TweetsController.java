package com.example.tweeteroapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tweeteroapi.DTO.TweetsDTO;
import com.example.tweeteroapi.models.Tweet;
import com.example.tweeteroapi.repositories.TweetsRepository;
import com.example.tweeteroapi.services.TweetsService;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

    @Autowired
    private TweetsService service;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody TweetsDTO req){
        service.saveTweet(req);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<List<Tweet>> getTweetsByUsername(@PathVariable() String username){
        List<Tweet> userTweets = service.getTweetsByUsername(username);

        return ResponseEntity.ok().body(userTweets);
    }
}
