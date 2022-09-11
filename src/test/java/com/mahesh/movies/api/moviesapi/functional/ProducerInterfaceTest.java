package com.mahesh.movies.api.moviesapi.functional;

import java.util.function.Supplier;

public class ProducerInterfaceTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "mahesh";
        System.out.println(supplier.get());
    }
}
