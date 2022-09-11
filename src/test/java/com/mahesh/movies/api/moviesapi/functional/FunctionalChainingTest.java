package com.mahesh.movies.api.moviesapi.functional;

import java.util.function.Function;

public class FunctionalChainingTest {
    public static void main(String[] args) {
        Function<Integer, String> functionInterface1 = (integer1) -> "mahesh".substring(0, integer1);

        Function<String, String> functionInterface2 = (str) -> str.substring(0, 2);

        System.out.println(functionInterface1.andThen(functionInterface2).apply(3));

    }
}
