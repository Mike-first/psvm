package com.hill.inheritanceandimplementation.p9nested;

public class Main {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
