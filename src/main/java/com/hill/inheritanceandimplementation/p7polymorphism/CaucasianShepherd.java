package com.hill.inheritanceandimplementation.p7polymorphism;

public class CaucasianShepherd extends Shepherd {
        public static String getField(){
        return field;
    }
    @Override
    public void doSmth() {
        System.out.println("doSmth like a CaucasianShepherd");
    }
}
