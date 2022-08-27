package com.mahesh.movies.api.moviesapi.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreatThanNumberAndSort {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11);

        List<Integer> integers = integerList.stream().filter(integer -> integer > 4).sorted().collect(Collectors.toList());

        integers.forEach(System.out::println);

    }
}
