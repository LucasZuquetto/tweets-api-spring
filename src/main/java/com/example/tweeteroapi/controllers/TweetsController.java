package com.example.tweeteroapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tweeteroapi.DTO.TweetsDTO;
import com.example.tweeteroapi.models.Tweet;
import com.example.tweeteroapi.repositories.TweetsRepository;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

    @Autowired
    private TweetsRepository repository;

    @PostMapping
    public String create(@RequestBody TweetsDTO req){
        repository.save(new Tweet(req));
        return "OK";
    }

    @GetMapping
    public List<Tweet> findAll(){
        return repository.findAll();
    }
}
