package com.mahesh.movies.api.moviesapi.functional.collectors;


import java.math.BigDecimal;


class Product {
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private BigDecimal price;
}

