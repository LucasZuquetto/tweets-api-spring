package com.example.tweeteroapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tweeteroapi.DTO.UserDTO;

@RestController
@RequestMapping()
public class AuthController {
    @PostMapping("sign-up")
    public String signUp(@RequestBody UserDTO req){
        return "OK";
    }
}