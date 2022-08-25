package com.mahesh.movies.api.moviesapi.puzzle;

import com.mahesh.movies.api.moviesapi.resources.MoviesController;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;

@SpringBootTest
class MoviesApiApplicationTests {

    @InjectMocks
    MoviesController moviesController;

    @Test
    void contextLoads() {
    }

    @Test
    void shouldMoviesListExists() {
        Response response = RestAssured.get("http://localhost:8080/movies");

        given().get("http://localhost:8080/movies").then().statusCode(200);
        System.out.println(response.getStatusCode());
        Assertions.assertEquals(response.getStatusCode(), 200);
    }

}
