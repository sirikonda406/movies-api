package com.mahesh.movies.api.moviesapi.functional.collectors;

import com.mahesh.movies.api.moviesapi.TestData.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class ListOrderTest {

    @Test
    public void compareTriplets(List<Integer> aliceList, List<Integer> bobList) {
        int alicePoints = 0;
        int bobPoints = 0;
        List<Integer> points = new ArrayList<>();

        if (aliceList.size() == 0 && bobList.size() == 0) return;

        listSizeSyncUp(aliceList, bobList);

        if (aliceList.size() == bobList.size()) {
            for (int i = 0; i <= aliceList.size(); i++) {
                if (aliceList.get(i) > bobList.get(i)) {
                    alicePoints = ++alicePoints;
                } else {
                    bobPoints = ++bobPoints;
                }
            }
            points.add(alicePoints);
            points.add(bobPoints);
        }


    }

    public void listSizeSyncUp(List<Integer> aliceList, List<Integer> bobList) {

        List<Integer> integers1 = TestData.rtrvIntegerList();
        List<Integer> integers2 = TestData.rtrvIntegerList();

        System.out.println(integers1 + "::::" + integers2);

    }


    @Test
    public void checkListOrderWithStreams() {
        Set<Integer> integerList = new HashSet<>(asList(1, 2, 3, 4, 5));
        List<Integer> integerSet = integerList.stream().collect(toList());
        Assertions.assertEquals(asList(1, 2, 3, 4, 5), integerSet);
    }

    @Test
    public void sumOfElementsWithStreams() {
        Set<Integer> integerList = new HashSet<>(asList(1, 2, 3, 4, 5));
        int sumInt = IntStream.of(1, 2, 3, 4, 5).sum();
        Assertions.assertEquals(15, sumInt);
    }

    @Test
    public void partitionListWithStreams() {
        List<Integer> integersStrings = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(integersStrings.stream().collect(partitioningBy(integer -> integer % 2 == 0)));
        // Assertions.assertEquals(15, sumInt);
    }


}
