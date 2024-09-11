package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public class Test2 {
    public static void main(String[] args) {
        Parent.c = "Parent.c";
        System.out.println(Parent.c);
        System.out.println(Child1.c);
        System.out.println(Child2.c);

        Child2.c = " Child2.c";
        System.out.println(Parent.c);
        System.out.println(Child1.c);
        System.out.println(Child2.c);
    }
}
