package com.example.movies.repository;

import com.example.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Repository
public interface MovieJpaRepository extends JpaRepository<Movie, Integer> {
    ArrayList<Movie> findByMusicDirectorContainingIgnoreCase(String musicDirector);
    ArrayList<Movie> findByDirectorContainingIgnoreCase(String director);
    ArrayList<Movie> findByMovieNameContainingIgnoreCase(String movieName);
    ArrayList<Movie> findByStarringContainingIgnoreCase(String starring);

}