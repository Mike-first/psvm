package com.hill.inheritanceandimplementation.p2privatememberinheritance;

public interface InterB {
    default void method() {
        System.out.println("B");
    }
}
