package com.mahesh.movies.api.moviesapi.puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

   static {
        System.out.println("hello first execution");
    }

    public static List<Integer> compareTriplets(List<Integer> aliceElements, List<Integer> bobsElements) {

        List<Integer> score=new ArrayList<>();

       // aliceElements.stream().max(Comparator.comparing(integer -> integer.compareTo(bobsElements.stream().))));

        return score;
    }

    public static void main(String[] args) {

        List<Integer> aliceElements = Arrays.asList(1, 3, 4, 5, 2, 7, 9);
        List<Integer> bobsElements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        compareTriplets(aliceElements, bobsElements);
    }
}
