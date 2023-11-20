package com.example.movies.model;

import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int movie_id;
    @Column(name="moviename")
    private String movieName;

    @Column(name="director")
    private String director;

    @Column(name="producers")
    private String producers;

    @Column(name="production")
    private String production;

    @Column(name="starring")
    private String starring;
    @Column(name="cinematography")
    private String cinematography;
    @Column(name="music_director")
    private String musicDirector;
    @Column(name="movie_language")
    private String movieLanguage;
    @Column(name="editor")
    private String editor;

    @Column(name="art_director")
    private String artDirector;
    @Column(name="stunts")
    private String stunts;
    @Column(name="budget")
    private String budget;

    @Column(name="box_office")
    private String boxOffice;

    @Column(name="image_url")
    private String imageUrl;

    public int getMovie_id() {
        return movie_id;
    }
    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getProducers() {
        return producers;
    }
    public void setProducers(String producers) {
        this.producers = producers;
    }
    public String getProduction() {
        return production;
    }
    public void setProduction(String production) {
        this.production = production;
    }
    public String getStarring() {
        return starring;
    }
    public void setStarring(String starring) {
        this.starring = starring;
    }
    public String getCinematography() {
        return cinematography;
    }
    public void setCinematography(String cinematography) {
        this.cinematography = cinematography;
    }
    public String getMusicDirector() {
        return musicDirector;
    }
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
    public String getMovieLanguage() {
        return movieLanguage;
    }
    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public String getArtDirector() {
        return artDirector;
    }
    public void setArtDirector(String artDirector) {
        this.artDirector = artDirector;
    }
    public String getStunts() {
        return stunts;
    }
    public void setStunts(String stunts) {
        this.stunts = stunts;
    }
    public String getBudget() {
        return budget;
    }
    public void setBudget(String budget) {
        this.budget = budget;
    }
    public String getBoxOffice() {
        return boxOffice;
    }
    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;

    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
