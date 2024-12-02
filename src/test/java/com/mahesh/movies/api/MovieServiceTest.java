package com.mahesh.movies.api;


import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import com.mahesh.movies.api.moviesapi.service.MoviesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MovieServiceTest {
    private MoviesService movieService;

    @BeforeEach
    void setUp() {
        movieService = new MoviesService();
    }

    @Test
    void testRtrvMovies_ShouldReturnListOfMovies() {
        List<MovieDto> movies = movieService.rtrvMovies();
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
        assertEquals(1, movies.size()); // Assuming there is 1 movie in the implementation
    }


}
