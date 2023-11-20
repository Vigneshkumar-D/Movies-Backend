package com.example.movies.repository;

import com.example.movies.model.Movie;
import com.example.movies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserJpaRepository extends JpaRepository<User, String>{
   User findByUserName(String userName);
   User findByUuid(String uuid);
}

