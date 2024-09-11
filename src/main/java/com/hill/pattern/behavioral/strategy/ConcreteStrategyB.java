package com.hill.pattern.behavioral.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void doIt() {
        System.out.println("Do smth like B");
    }
}
