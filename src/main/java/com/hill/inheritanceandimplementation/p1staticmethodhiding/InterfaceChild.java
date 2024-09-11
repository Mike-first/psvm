package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public interface InterfaceChild extends InterfaceBase {
    default void doItAnotherWay() {
        doIt();
    }
}
