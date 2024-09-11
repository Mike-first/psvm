//in this variation, the builder (Client - Builder - Product) takes place, it is designed to perform the same task as V1.URL.Composer, but everything is somewhat unclear and illogical in my opinion.
//the question remains: what if not all fields were set? where to control this?
//the Product constructor is public, but requires a Builder object, however, the Builder constructor is also public, which means there are no obstacles to creating a Product object in an incorrect/unexpected state
//I see in this implementation a violation of the High Cohesion and low coupling principle and a violation of encapsulation (in terms of access restrictions)

package com.hill.pattern.creational.builder.V2;

public final class Builder {

    private String color;
    private int price;

    public Builder() {
    }

    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public Builder setPrice(int price) {
        this.price = price;
        return this;
    }

    protected String getColor() {
        return color;
    }

    protected int getPrice() {
        return price;
    }

    public Product build() {
        return new Product(this);
    }
}