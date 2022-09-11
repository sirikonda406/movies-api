package com.mahesh.movies.api.moviesapi.functional;

import java.util.HashMap;
import java.util.function.Consumer;

public class ConsumerInterfaceTest {

    public static void main(String[] args) {
        Consumer<String> consumer1 = (s) -> {
            String str = s.substring(0, 3);
            System.out.println("consumer printing input:::" + str);
        };
        Consumer<String> consumer2 = (s) -> System.out.println("processed string printing :::" + s);
        consumer1.andThen(consumer2).accept("mahesh");


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("mahesh", "mahesh");

        hashMap.forEach((key, value) -> System.out.println(key + value));


    }
}
