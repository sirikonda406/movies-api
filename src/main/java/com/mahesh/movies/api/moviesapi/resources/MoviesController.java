package com.mahesh.movies.api.moviesapi.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@RestController
public class MoviesController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping(path = "/movies", produces = "application/json")
    public ResponseEntity<MovieDto> rtrvMovies() {
        MovieDto movieDto= MovieDto.builder().movieId("1").movieDescription("Avatar").movieGenre("thriller").movieName("Avatar").build();
        Set<ConstraintViolation<MovieDto>> validationFactory=Validation.buildDefaultValidatorFactory().getValidator().validate(movieDto,MovieDto.class);
        validationFactory.stream().forEach(System.out::println);
        return ResponseEntity.ok(movieDto);
    }
}
