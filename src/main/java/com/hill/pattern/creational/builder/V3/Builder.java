//this is a more complex variation of the pattern (Director - AbstractBuilder - Builder - Product)
//or (Director - interface Builder - ConcreteBuilder - Product) - there is no big difference - and the most common
//allows you to separate the construction of an object from its representation

package com.hill.pattern.creational.builder.V3;

public abstract class Builder {
    Product product;

    void createProduct() {
        product = new Product();
    }

    abstract void buildModel();

    abstract void buildColor();

    abstract void buildPrice();

    Product getProduct() {
        return product;
    }
}
