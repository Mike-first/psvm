package com.hill.dbconnector;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = DatabaseHelper.fetch("SELECT * FROM orders", Order.class);

        orders.forEach(System.out::println);
    }
}
