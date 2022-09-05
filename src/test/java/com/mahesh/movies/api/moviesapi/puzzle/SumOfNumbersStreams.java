package com.mahesh.movies.api.moviesapi.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbersStreams {

    public static void main(String[] args) {
        List<Integer> integersStrings = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println();

        System.out.println(integersStrings.stream().collect(Collectors.groupingBy(integer -> integer % 2)));

        System.out.println(integersStrings.stream().collect(Collectors.reducing(0, (subtotal, element) -> subtotal + element)));


    }
}
