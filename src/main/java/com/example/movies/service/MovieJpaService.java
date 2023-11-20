package com.example.movies.service;

import com.example.movies.model.Movie;
import com.example.movies.model.User;
import com.example.movies.repository.MovieJpaRepository;
import com.example.movies.repository.MovieRepository;
import com.example.movies.repository.UserJpaRepository;
import com.example.movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieJpaService implements MovieRepository {
    @Autowired(required = true)
    private MovieJpaRepository movieJpaRepository;

    @Autowired(required = true)
    private UserJpaRepository userJpaRepository;

    @Override
    public String userAuthentication(User user){
        return "hello user";
    }


    @Override
//    @PreAuthorize("#uuid == authentication.principal.uuid")
    public ArrayList<Movie> getMovies(String uuid) {
        System.out.println("In Service: "+uuid);
        User user = userJpaRepository.findByUuid(uuid);
        if (user != null) {
            List<Movie> movies = movieJpaRepository.findAll();
            return new ArrayList<>(movies);
        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
    }

    @Override
    public Movie getMovieById(int movieId){
        try{
            return movieJpaRepository.findById(movieId).get();
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public ArrayList<Movie> getMovieByMusicDirectorContainingIgnoreCase(String musicDirector){
        try{
            return movieJpaRepository.findByMusicDirectorContainingIgnoreCase(musicDirector);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ArrayList<Movie> getMovieByDirectorContainingIgnoreCase(String director){
        try{
            return movieJpaRepository.findByDirectorContainingIgnoreCase(director);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ArrayList<Movie> getMovieByNameContainingIgnoreCase(String movieName){
        try{
            return movieJpaRepository.findByMovieNameContainingIgnoreCase(movieName);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ArrayList<Movie> getMovieByStarringContainingIgnoreCase(String starring){
        try{
            return movieJpaRepository.findByStarringContainingIgnoreCase(starring);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}


