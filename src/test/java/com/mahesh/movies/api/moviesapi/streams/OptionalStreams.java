package com.mahesh.movies.api.moviesapi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalStreams {
    public static void main(String[] args) {
        List<Optional> optionalList = Arrays.asList(Optional.empty(), Optional.of("Hello"), Optional.of("world"));

        optionalList.stream().flatMap(Optional::stream).forEach(System.out::println);
    }
}
