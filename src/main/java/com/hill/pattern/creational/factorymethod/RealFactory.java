package com.hill.pattern.creational.factorymethod;

public class RealFactory implements Factory {
    @Override
    public Builder create() {
        return new RealBuilder();
    }
}
