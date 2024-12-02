package com.mahesh.movies.api.moviesapi.functional;

import java.util.function.Function;

public class HandPainting {

    public static void main(String[] args) {

        Paint draw = (paint) -> {
            for (int i = 10; i >= 0; --i) {
                System.out.println("color painted :::" + i + ":::::" + paint);
            }
            return paint;
        };

        draw.doPaint("red");

        Function<Integer, String> function = (integer) -> {
            String s = integer + "hi";
            return s;
        };

        System.out.println(function.apply(10));


    }

}
