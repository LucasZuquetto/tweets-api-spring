package com.example.tweeteroapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tweeteroapi.models.Tweet;

public interface TweetsRepository extends JpaRepository<Tweet, Long>{
    List<Tweet> findByUsername(String username);
}
