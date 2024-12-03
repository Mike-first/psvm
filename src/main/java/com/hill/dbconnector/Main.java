package com.hill.dbconnector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Order> orders = DatabaseHelper.fetch(Queries.Orders.ORDERS_ALL, Order.class);
//        orders.forEach(System.out::println);

//        ClientQueries clientQueries = new ClientQueries();
//        List<Client> clients = clientQueries.getClientsOlderThan18();
//        clients.forEach(System.out::println);

        List<Integer> numbers = List.of(5, 2, 7, 1, 3);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Arrays.asList(5, 2, 7, 1, 3).stream();
    }
}
