package com.hill.pattern.creational.factorymethod;

public class AlgorithmFactory implements Factory {
    @Override
    public Builder create() {
        return new AlgorithmBuilder();
    }
}
