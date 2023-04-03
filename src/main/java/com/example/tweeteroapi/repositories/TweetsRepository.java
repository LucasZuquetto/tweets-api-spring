package com.example.tweeteroapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tweeteroapi.models.Tweet;

public interface TweetsRepository extends JpaRepository<Tweet, Long>{
    
}
