package com.mahesh.movies.api.moviesapi.service;

import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

@Service
public class MoviesService implements IMoviesService {

    Map<String , MovieDto> MOVIES =new HashMap<>();

    @PostConstruct
    public void init(){
        IntStream.rangeClosed(1,10).forEach(value -> MOVIES.put(String.valueOf(value), MovieDto.builder().movieDescription("Avatar"+value).movieGenre("thriller"+value).movieName("Avatar"+value).build()));
    }

    @Override
    public MovieDto rtrvMovies(String movieId) {
        return MOVIES.get(movieId);
    }

    public void clearDatabase() {
        // Implementation to clear the database
    }

    public void simulateDatabaseError(boolean simulate) {
        // Implementation to simulate a database error
    }
}
