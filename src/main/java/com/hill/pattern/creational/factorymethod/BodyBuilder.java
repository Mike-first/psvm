package com.hill.pattern.creational.factorymethod;

public class BodyBuilder implements Builder {
    @Override
    public void build() {
        System.out.println("Builder builds body");
    }
}
