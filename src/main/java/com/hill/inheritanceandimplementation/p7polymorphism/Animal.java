package com.hill.inheritanceandimplementation.p7polymorphism;

public abstract class Animal {
    public static String field = "Animal";

    public static String getField(){
        return field;
    }
    abstract void sound();

    public void doSmth(){
        System.out.println("doSmth like an Animal");
    }
}
