package com.mahesh.movies.api.moviesapi.service;

import com.mahesh.movies.api.moviesapi.dto.MovieDto;

import java.util.List;

public interface IMoviesService {

    List<MovieDto> rtrvMovies();
}
