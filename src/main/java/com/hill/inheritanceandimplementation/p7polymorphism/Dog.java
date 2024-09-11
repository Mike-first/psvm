package com.hill.inheritanceandimplementation.p7polymorphism;

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("sound like a dog");
    }

    @Override
    public void doSmth() {
        System.out.println("doSmth like a Dog");
    }
}
