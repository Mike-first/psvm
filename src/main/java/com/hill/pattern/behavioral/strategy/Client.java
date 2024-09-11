//Strategy
//behavioral pattern, consists of a behavior interface (Strategy) and implementations of this interface (ConcreteStrategyA and B)
//united by the feature of the implemented interface, which means that objects of these classes can be passed
//by interface reference and any object (ConcreteStrategy) can call the method declared in the interface.
//the pattern contains an executor class, which compares the field of type Strategy, set by the setter.
//there can be any number of strategy implementations, they can be passed to the executor and executed without changing the executor code

package com.hill.pattern.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.setStrategy(new ConcreteStrategyA());
        executor.execute();
        executor.setStrategy(new ConcreteStrategyA());
        executor.execute();
    }
}
