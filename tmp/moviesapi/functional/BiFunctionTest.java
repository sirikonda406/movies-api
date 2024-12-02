package com.mahesh.movies.api.moviesapi.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionTest {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Raj", 3000);
        hashMap.put("Goa", 40000);
        hashMap.put("Mahesh", 50000);

        hashMap.forEach((key, value) -> System.out.println("Key:::" + key + "::value::" + value));


        List<Integer> integers= Arrays.asList(5,7,3,9,4,1,2,8,6);


        Predicate<Integer> predicate = (integer)-> integer < 10;

        integers.stream().filter(predicate).collect(Collectors.toList()).forEach(integer -> System.out.println(integer));

        System.out.println(predicate.test(11));

        Comparator<Integer> comparator =(i1,i2)-> (i1.compareTo(i2));

        integers.sort(comparator);

        integers.forEach(integer -> System.out.println(integer));


    }
}
