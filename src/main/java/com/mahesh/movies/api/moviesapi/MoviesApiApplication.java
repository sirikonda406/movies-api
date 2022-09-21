package com.mahesh.movies.api.moviesapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApiApplication {

    public static void main(String[] args) {
        System.out.println("Hell Mahesh main(String[] args) starting");
        SpringApplication.run(MoviesApiApplication.class, args);
        System.out.println("Hell Mahesh main(String[] args) ending");
    }

}
