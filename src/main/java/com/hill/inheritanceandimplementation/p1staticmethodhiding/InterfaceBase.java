package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public interface InterfaceBase {
    static void doSmth() {
        System.out.println("");
    }

    default void doIt() {
        doSmth();
    }
}
