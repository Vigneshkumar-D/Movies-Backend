package com.example.movies.repository;

import com.example.movies.model.Movie;
import com.example.movies.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface MovieRepository {
    ArrayList<Movie> getMovies(String token);
    Movie getMovieById(int movieId);
    ArrayList<Movie> getMovieByMusicDirectorContainingIgnoreCase(String musicDirector);
    ArrayList<Movie> getMovieByDirectorContainingIgnoreCase(String director);
    ArrayList<Movie> getMovieByNameContainingIgnoreCase(String movieName);
    ArrayList<Movie> getMovieByStarringContainingIgnoreCase(String actor);
    String userAuthentication(User user);
}
