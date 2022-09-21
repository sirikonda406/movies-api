package com.mahesh.movies.api.moviesapi;

import com.mahesh.movies.api.moviesapi.properties.ApplicationProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MoviesApiApplication {

    public static void main(String[] args) {
        System.out.println("Hell Mahesh main(String[] args) starting");
        SpringApplication.run(MoviesApiApplication.class, args);
        System.out.println("Hell Mahesh main(String[] args) ending");
    }

}
