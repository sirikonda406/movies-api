package com.mahesh.movies.api.moviesapi.TestData;

import groovy.transform.builder.Builder;

import java.util.*;

@Builder
public class TestData {

    private List<Integer> integerList;
    private List<String> stringList;
    private Map<String, String> stringStringMap;
    private Map<Integer, String> integerStringMap;
    private Map<String, Integer> stringIntegerMap;
    private Map<String, List<String>> stringListMap;

    public static void main(String[] args) {

        System.out.println(new Random().nextInt(20));
        System.out.println(rtrvIntegerList());
    }

    public static List<Integer> rtrvIntegerList() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= new Random().nextInt(20); i++) {
            integers.add(i);
        }
        Collections.shuffle(integers);
        return integers;
    }


}
