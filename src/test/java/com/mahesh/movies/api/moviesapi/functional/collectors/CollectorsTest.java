package com.mahesh.movies.api.moviesapi.functional.collectors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        Customer customer1 = new Customer("Bill","1");
        Customer customer2 = new Customer("John","2");

        Product device1 = new Product("Device 1", new BigDecimal("30.00"));
        Product device2 = new Product("Device 2", new BigDecimal("50.00"));
        Product device3 = new Product("Device 3", new BigDecimal("110.00"));

        orders.add(new Order("1", customer1).addOrderContent(device1, 1));
        orders.add(new Order("2", customer1).addOrderContent(device2, 1));
        orders.add(new Order("3", customer2).addOrderContent(device3, 1));

        System.out.println(orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer)));
    }
}
