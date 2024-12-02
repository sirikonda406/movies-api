package com.mahesh.movies.api.moviesapi.puzzle;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FequencyOfNumbers {

    public static void main(String[] args) {
        String input = "124445";

        Map<String, Long> countMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countMap.entrySet().stream().forEach(key -> System.out.println(key.getKey() + "::::" + key.getValue()));

        countMap = Arrays.stream(input.split("")).distinct().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //all occurences counting

        countMap.forEach((s, aLong) -> System.out.println(s + "::" + aLong));  // distinct count

    }
}
