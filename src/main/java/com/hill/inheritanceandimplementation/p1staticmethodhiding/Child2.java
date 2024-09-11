package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public class Child2 extends Parent implements Cloneable {
    //this field will never be used, because public static String b declared in basic Parent
    //we can only use getter for this field and hide it (getter) - see Child1
    public static String b = "static field in Child2";

    public static void staticMethod(int arg){
        System.out.println("Child2.staticMethod with arg");
    }
}
