package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public class Child1 extends Parent {
    //@Override - error - this place we can not override public static int getB()
    // we can hide parent's method. looks the same, but not overriding
    public static String getB() {
        return "static method in Child1 hide Parent' one";
    }
}
