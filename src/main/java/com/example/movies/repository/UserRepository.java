package com.example.movies.repository;

import com.example.movies.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserRepository {
//    UserDetails loadUserByUserName(String username) throws UsernameNotFoundException;

    ResponseEntity<HashMap<String, String>> userAuthentication(User user);
}
