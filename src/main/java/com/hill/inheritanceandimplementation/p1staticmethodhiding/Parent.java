package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public class Parent {
    private String a = "non static field in Parent";
    public static String b = "static field in Parent";

    public static String c = "";

    public String getA() {
        return a;
    }

    public static String getB() {
        return b;
    }

    public static void staticMethod(){
        System.out.println("A.staticMethod");
    }

}
