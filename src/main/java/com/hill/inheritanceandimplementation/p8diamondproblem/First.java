package com.hill.inheritanceandimplementation.p8diamondproblem;

public interface First {
    default void simpleMethod() {
        System.out.println("First interface default method");
    }
}
