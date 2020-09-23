package com.company;

public class Movie {


    String movieName;
    int likes;
    int releaseYear;
    int min;

    public Movie(String movieName, int likes, int releaseYear, int min) {
        this.movieName = movieName;
        this.likes = likes;
        this.releaseYear = releaseYear;
        this.min = min;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
