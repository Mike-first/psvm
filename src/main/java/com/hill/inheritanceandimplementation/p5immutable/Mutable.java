package com.hill.inheritanceandimplementation.p5immutable;

public class Mutable extends ImmutableBad {
    private int anotherA;

    public Mutable(int a) {
        super(a);
    }

    public int getA() {
        return anotherA;
    }

    public void setA(int a) {
        anotherA = a;
    }
}
