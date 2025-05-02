package com.mahesh.movies.api.moviesapi.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import com.mahesh.movies.api.moviesapi.service.IMoviesService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {
    private ObjectMapper objectMapper = new ObjectMapper();
    private IMoviesService moviesService;

    public MoviesController(IMoviesService moviesService) {
        this.moviesService = moviesService;
    }


    @GetMapping(path = "/movies", produces = "application/json")
    public ResponseEntity<List<MovieDto>> rtrvMovies() {
        return ResponseEntity.ok(moviesService.rtrvMovies());
    }

    @GetMapping(path = "/hello", produces = "application/json")
    public ResponseEntity<MovieDto> helloMovie() {
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(MovieDto.builder().movieId("1").movieDescription("Avatar").movieGenre("thriller").movieName("Avatar").build());
    }

    @GetMapping(path = "/test", produces = "application/json")
    public ResponseEntity<MovieDto> helloTestMovie() {
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(MovieDto.builder().movieId("1").movieDescription("Avatar").movieGenre("thriller").movieName("Avatar").build());
    }
}
