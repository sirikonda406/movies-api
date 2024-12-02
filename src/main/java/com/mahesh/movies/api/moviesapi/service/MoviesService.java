package com.mahesh.movies.api.moviesapi.service;

import com.mahesh.movies.api.moviesapi.dto.MovieDto;

import java.util.List;

public class MoviesService implements IMoviesService {
    @Override
    public List<MovieDto> rtrvMovies() {
        return List.of(MovieDto.builder().movieId("1").movieDescription("Avatar").movieGenre("thriller").movieName("Avatar").build());
    }

    public void clearDatabase() {
        // Implementation to clear the database
    }

    public void simulateDatabaseError(boolean simulate) {
        // Implementation to simulate a database error
    }
}
