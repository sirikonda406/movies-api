package com.mahesh.movies.api.moviesapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieDto {
    private String movieId;
    private String movieName;
    private String movieDescription;
    private String movieGenre;
}
