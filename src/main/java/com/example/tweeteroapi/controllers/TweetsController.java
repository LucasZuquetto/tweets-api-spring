package com.example.tweeteroapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tweeteroapi.DTO.TweetsDTO;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
    @PostMapping
    public String create(@RequestBody TweetsDTO req){
        return "OK";
    }
}
