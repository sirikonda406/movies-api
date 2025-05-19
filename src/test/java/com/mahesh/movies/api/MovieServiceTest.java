package com.mahesh.movies.api;


import com.mahesh.movies.api.moviesapi.dto.MovieDto;
import com.mahesh.movies.api.moviesapi.service.MoviesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MovieServiceTest {
    private MoviesService movieService;

    @BeforeEach
    void setUp() {
        movieService = new MoviesService();
    }

    @Test
    void testRetrieveMovies_ShouldExtractWorkflowId() {
        String requestUri = "/workflow/681cb7acfd4e9602e71ff364/graphs";
        String workflowId = extractWorkflowId(requestUri);
        assertNotNull(workflowId);
        System.out.println("Extracted Workflow ID: " + workflowId);
    }


    private String extractWorkflowId(String uri) {
        Pattern pattern = Pattern.compile("/workflow/([a-f0-9]{24})/graphs");
        Matcher matcher = pattern.matcher(uri);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }



}
