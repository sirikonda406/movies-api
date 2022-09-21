package com.mahesh.movies.api.moviesapi.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Bean;

import java.beans.ConstructorProperties;

@ConstructorBinding
@ConfigurationProperties("movies.test")
@Data
public class ApplicationProperties {
    private String movieName;
    private String movieGenre;
    private String budget;
}
