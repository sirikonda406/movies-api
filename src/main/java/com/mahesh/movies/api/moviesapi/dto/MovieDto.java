package com.mahesh.movies.api.moviesapi.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;

@Data
@Builder
public class MovieDto {
    @Max(value = 10,message = "Must not less than 10 chars")
    private String movieId;
    private String movieName;
    private String movieDescription;
    private String movieGenre;
}
