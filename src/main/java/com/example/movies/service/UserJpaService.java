package com.example.movies.service;

import com.example.movies.model.User;
import com.example.movies.model.UserPrincipal;
import com.example.movies.repository.UserJpaRepository;
import com.example.movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class UserJpaService implements UserRepository, UserDetailsService {
    @Autowired(required = true)
    public UserJpaRepository userJpaRepository;
    String token;

    @Override
    public ResponseEntity<HashMap<String, String>> userAuthentication(User user) {
        try {

            // Assuming the repository method searches by username
            User foundUser = userJpaRepository.findByUserName(user.getUserName());
            if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
                UUID randomUUID = UUID.randomUUID();
                token = randomUUID.toString();
                HashMap<String, String> response = new HashMap<>();
                response.put("token", token);
                user.setUuid(token);
                userJpaRepository.save(user);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                // Handle case when user is not found or password doesn't match
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found or invalid credentials");
            }
        } catch (Exception e) {
            // Log the exception for debugging purposes
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error occurred");
        }
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userJpaRepository.findByUserName(username);
        if(user==null){
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new UserPrincipal(user);
    }
}
