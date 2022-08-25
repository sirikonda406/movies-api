package com.mahesh.movies.api.moviesapi.string;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11StringFeatures {
    public static void main(String[] args) throws IOException, InterruptedException {
        String str = "mahesh";
        System.out.println(str.repeat(1));

       // HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create("http://localhost:8080/movies")).build(),responseInfo -> responseInfo.toString());

    }
}
