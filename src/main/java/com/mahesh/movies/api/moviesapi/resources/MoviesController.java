package com.mahesh.movies.api.moviesapi.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.movies.api.moviesapi.properties.ApplicationProperties;
import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.Set;

@RestController
public class MoviesController {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private ApplicationProperties applicationProperties;

    @GetMapping(path = "/movies", produces = "application/json")
    public ResponseEntity<MovieDto> rtrvMovies() {
        System.out.println("application properties" + applicationProperties.getMovieGenre());

        MovieDto movieDto = MovieDto.builder().movieId("1").movieDescription("Avatar").movieGenre("thriller").movieName("Avatar").build();
        Set<ConstraintViolation<MovieDto>> validationFactory = Validation.buildDefaultValidatorFactory().getValidator().validate(movieDto, MovieDto.class);
        validationFactory.stream().forEach(System.out::println);
        return ResponseEntity.ok(movieDto);
    }
}
