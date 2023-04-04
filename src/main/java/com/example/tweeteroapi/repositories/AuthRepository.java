package com.example.tweeteroapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tweeteroapi.models.Users;

public interface AuthRepository extends JpaRepository<Users, Long>{
}
