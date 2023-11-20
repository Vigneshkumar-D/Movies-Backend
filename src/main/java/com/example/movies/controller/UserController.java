package com.example.movies.controller;

import com.example.movies.model.User;
import com.example.movies.service.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    public UserJpaService userJpaService;

    @PostMapping(value="/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HashMap<String, String>> userAuthentication(@RequestBody User user) {
        System.out.println(user.getUserName());
        return userJpaService.userAuthentication(user);
    }
}
