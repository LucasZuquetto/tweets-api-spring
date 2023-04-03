package com.example.tweeteroapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tweeteroapi.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
