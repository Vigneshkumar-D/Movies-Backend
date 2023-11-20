package com.example.movies.controller;

import com.example.movies.model.Movie;
import com.example.movies.model.User;
import com.example.movies.service.MovieJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
public class MoviesController{
    @Autowired(required=true)
    public MovieJpaService movieJpaService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies(@RequestHeader("uuid") String uuid){
        return movieJpaService.getMovies(uuid);
    }
    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId){
        return movieJpaService.getMovieById(movieId);
    }
    @GetMapping("/movies/music-director")
    public ArrayList<Movie> getMovieByMusicDirectorContainingIgnoreCase(@RequestParam String musicDirector){
        return movieJpaService.getMovieByMusicDirectorContainingIgnoreCase(musicDirector);
    }
    @GetMapping("/movies/director")
    public ArrayList<Movie> getMovieByDirectorContainingIgnoreCase(@RequestParam String director){
        return movieJpaService.getMovieByDirectorContainingIgnoreCase(director);
    }
    @GetMapping("/movies/name")
    public ArrayList<Movie> getMovieByNameContainingIgnoreCase(@RequestParam String movieName){
        return movieJpaService.getMovieByNameContainingIgnoreCase(movieName);
    }
    @GetMapping("movies/starring")
    public ArrayList<Movie> getMovieByStarringContainingIgnoreCase(@RequestParam String starring){
        return movieJpaService.getMovieByStarringContainingIgnoreCase(starring);
    }
}
