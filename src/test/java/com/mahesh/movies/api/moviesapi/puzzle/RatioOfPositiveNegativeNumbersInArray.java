package com.mahesh.movies.api.moviesapi.puzzle;

import java.util.Arrays;
import java.util.Collections;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class RatioOfPositiveNegativeNumbersInArray {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, -1, -2, -3, 0, 0};
        float[] countInt = new float[3];
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                ++negative;
            }
            if (ints[i] > 0) {
                ++positive;
            }
            if (ints[i] == 0) {
                ++zero;
            }
        }

        countInt[0] = positive;
        countInt[1] = negative;
        countInt[2] = zero;
        //System.out.println(countInt[0] / ints.length);
        // System.out.println(countInt[1] / ints.length);
        // System.out.println(countInt[2] / ints.length);

        //Arrays.stream(ints).collect(groupingBy(s -> s < 0, counting())).forEach((key, value) -> System.out.println("key::::" + key + "::value::" + value));
        Arrays.stream(ints);

        Arrays.stream(ints).filter(integer -> integer >= 0).collect(groupingBy(s -> s, counting())).forEach((key, value) -> System.out.println("key::::" + key + "::value::" + value));

        // Arrays.stream(ints).collect(groupingBy(s -> s, counting())).forEach((key, value) -> System.out.println("key::::" + key + "::value::" + Float.valueOf(value) / Float.valueOf(ints.length)));

    }
}
