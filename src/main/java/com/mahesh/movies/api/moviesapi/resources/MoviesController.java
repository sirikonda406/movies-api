package com.mahesh.movies.api.moviesapi.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import com.mahesh.movies.api.moviesapi.service.IMoviesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {
    private ObjectMapper objectMapper = new ObjectMapper();
    private IMoviesService moviesService;


    @GetMapping(path = "/movies", produces = "application/json")
    public ResponseEntity<List<MovieDto>> rtrvMovies() {
        return ResponseEntity.ok(moviesService.rtrvMovies());
    }
}
