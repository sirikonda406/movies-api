package com.mahesh.movies.api.moviesapi.functional;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {

        String str = "mahesh";

        Predicate<String> predicate1 = s -> s.length() > 0;

        Predicate<String> predicate2 = s -> s.equals("mahesh");

        System.out.println(predicate1.and(predicate2).test(str));

    }
}
