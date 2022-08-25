package com.mahesh.movies.api.moviesapi.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SequenceIdentification {

    public static void main(String[] args) {
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
    }
}
