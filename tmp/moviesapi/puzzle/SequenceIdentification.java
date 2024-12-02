package com.mahesh.movies.api.moviesapi.puzzle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class SequenceIdentification {

    public static void main(String[] args) {
        String input = "123456";

        Map<Object, Long> bits = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(Arrays.stream(input.split("")).collect(Collectors.maxBy(Comparator.comparing(s -> s))));
        System.out.println(Arrays.stream(input.split("")).collect(Collectors.summingLong(value -> Integer.valueOf(value))));
    }

   /* public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1, 4, 2, 4, 4, 4, 5);
        int nextElement = 1;
        int duplicateElementSize = 0;
        for (int currentElement = 0; currentElement < sequence.size() - 1; currentElement++) {
            if (duplicateNumber(sequence, currentElement, nextElement)) duplicateElementSize++;
            nextElement++;
        }
        System.out.println("duplicateSize::::" + duplicateElementSize);
    }

    public static boolean duplicateNumber(List<Integer> sequence, Integer currentElement, int nextElement) {
        boolean duplicateFound = false;
        if (nextElement >= sequence.size()) //skip last element
            nextElement = currentElement;
        if (Objects.equals(sequence.get(currentElement), sequence.get(nextElement))) {
            duplicateFound = true;
            System.out.println("duplicate element value ::::/n" + sequence.get(currentElement));
        }
        return duplicateFound;
    }*/
}
