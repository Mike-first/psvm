package com.hill.inheritanceandimplementation.p8diamondproblem;

public interface Second {
    default void simpleMethod() {
        System.out.println("Second interface default method");
    }
    static void simpleMethod2(){};

}
