//abstract, since it contains private fields, we use an abstract class

package com.hill.pattern.structural.bridge;

public abstract class Building {
    protected Builder builder;

    public Building(Builder builder) {
        this.builder = builder;
    }

    public abstract void build();
}
