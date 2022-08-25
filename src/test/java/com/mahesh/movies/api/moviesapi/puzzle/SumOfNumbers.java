package com.mahesh.movies.api.moviesapi.puzzle;

public class SumOfNumbers {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            j = ++j;
        }

        System.out.println("sum:::" + j);
    }
}
