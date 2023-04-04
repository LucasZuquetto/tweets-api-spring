package com.example.tweeteroapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tweeteroapi.DTO.UserDTO;
import com.example.tweeteroapi.models.Users;
import com.example.tweeteroapi.repositories.AuthRepository;

@Service
public class AuthService {
    @Autowired
    private AuthRepository repository;

    public void signUp(UserDTO data) {
        repository.save(new Users(data));
    }
}
