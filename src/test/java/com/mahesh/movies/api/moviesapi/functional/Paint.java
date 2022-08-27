package com.mahesh.movies.api.moviesapi.functional;

@FunctionalInterface
public interface Paint {

    default String color(String color) {
        System.out.println("use color " + color);
        return color;
    }

    String doPaint(String paint);
}
