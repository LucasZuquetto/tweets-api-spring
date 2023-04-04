package com.example.tweeteroapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tweeteroapi.DTO.UserDTO;
import com.example.tweeteroapi.services.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping
    public ResponseEntity<Object> signUp(@Valid @RequestBody UserDTO req){
        service.signUp(req);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
