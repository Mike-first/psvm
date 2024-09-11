package com.hill.inheritanceandimplementation.p2privatememberinheritance;

public class AClass {
    private int x; // = 10; //default value, otherwise 0

    public void method() {
        System.out.println("AClass method was called");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
