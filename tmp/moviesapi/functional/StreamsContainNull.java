package com.mahesh.movies.api.moviesapi.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamsContainNull {

    public static void main(String[] args) {
        List<String> stringList=Arrays.asList("abc","rcde",null,"zmah","mama",null);

        stringList.stream().filter(Objects::nonNull).sorted().forEach(System.out::println);
    }
}
