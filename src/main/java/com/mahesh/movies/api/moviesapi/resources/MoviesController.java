package com.mahesh.movies.api.moviesapi.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import com.mahesh.movies.api.moviesapi.service.IMoviesService;
import org.slf4j.Logger;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    private static final String DEFAULT_MOVIE_ID = "1";
    private static final String DEFAULT_MOVIE_NAME = "Avatar";
    private static final String DEFAULT_MOVIE_DESC = "Avatar";
    private static final String DEFAULT_MOVIE_GENRE = "thriller";

    private final Logger logger = org.slf4j.LoggerFactory.getLogger(MoviesController.class);
    private final ObjectMapper objectMapper;
    private final IMoviesService moviesService;

    public MoviesController(ObjectMapper objectMapper, IMoviesService moviesService) {
        this.objectMapper = objectMapper;
        this.moviesService = moviesService;
    }

    @GetMapping(path = "/movies/{id}", produces = "application/json")
    public ResponseEntity<MovieDto> rtrvMovies(@PathVariable String id) {
        logger.info("Retrieving movie with id: {}", id);
        return ResponseEntity.ok(moviesService.rtrvMovies(id));
    }

    @GetMapping(path = "/hello", produces = "application/json")
    public ResponseEntity<MovieDto> helloMovie() {
        return createDefaultMovieResponse();
    }

    @GetMapping(path = "/test", produces = "application/json")
    public ResponseEntity<MovieDto> helloTestMovie() {
        return createDefaultMovieResponse();
    }

    private ResponseEntity<MovieDto> createDefaultMovieResponse() {
        MovieDto defaultMovie = MovieDto.builder()
                .movieId(DEFAULT_MOVIE_ID)
                .movieName(DEFAULT_MOVIE_NAME)
                .movieDescription(DEFAULT_MOVIE_DESC)
                .movieGenre(DEFAULT_MOVIE_GENRE)
                .build();
        return ResponseEntity.ok(defaultMovie);
    }
}

