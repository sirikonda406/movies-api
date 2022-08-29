package com.mahesh.movies.api.moviesapi.functional.collectors;

class OrderContent {
    private Product product;

    public OrderContent(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private Integer quantity;
}
