package com.hill.pattern.creational.builder.V2;

public final class Product {
    private final String color;
    private final int price;

    public Product(Builder builder) {
        this.color = builder.getColor();
        this.price = builder.getPrice();
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Color: " + getColor() + ", Price: " + getPrice();
    }
}