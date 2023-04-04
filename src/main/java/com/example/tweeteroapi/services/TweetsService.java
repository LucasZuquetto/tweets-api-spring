package com.example.tweeteroapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tweeteroapi.DTO.TweetsDTO;
import com.example.tweeteroapi.models.Tweet;
import com.example.tweeteroapi.models.Users;
import com.example.tweeteroapi.repositories.AuthRepository;
import com.example.tweeteroapi.repositories.TweetsRepository;

@Service
public class TweetsService {
    @Autowired
    private TweetsRepository tweetsRepository;

    @Autowired
    private AuthRepository authRepository;

    public void saveTweet(TweetsDTO req){
        Users userData = authRepository.findByUsername(req.username());
        String avatar = userData.getAvatar();
        Tweet obj = new Tweet(req);
        obj.setAvatar(avatar);
        tweetsRepository.save(obj);
    }

    public List<Tweet> getTweetsByUsername(String data){
        return tweetsRepository.findByUsername(data);
    }
}
