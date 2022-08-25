package com.mahesh.movies.api.moviesapi.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping(path = "/movies", produces = "application/json")
    public ResponseEntity<MovieDto> rtrvMovies() {
        return ResponseEntity.ok(MovieDto.builder().movieId("1").movieDescription("Avatar").movieGenre("thriller").movieName("Avatar").build());
    }
}
