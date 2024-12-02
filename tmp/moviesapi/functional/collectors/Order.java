package com.mahesh.movies.api.moviesapi.functional.collectors;

import java.util.HashSet;
import java.util.Set;

class Order {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<OrderContent> getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(Set<OrderContent> orderContent) {
        this.orderContent = orderContent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private String id;
    private Set<OrderContent> orderContent = new HashSet<>();
    private Customer customer;

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Order addOrderContent(Product product, int amount) {
        orderContent.add(new OrderContent(product, amount));
        return this;
    }
}
