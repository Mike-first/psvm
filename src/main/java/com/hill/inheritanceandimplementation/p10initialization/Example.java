package com.hill.inheritanceandimplementation.p10initialization;

public class Example {
    public Example() {
        System.out.println("constructor");
    }

    {
        System.out.println("non-static initialization block");
    }

    static {
        System.out.println("static initialization block");
    }
}