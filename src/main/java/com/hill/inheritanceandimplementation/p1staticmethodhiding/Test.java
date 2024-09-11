//overriding a static method is not possible, but hiding is possible
//overriding a static field is not possible - see Child2

package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent not static field = " + parent.getA());
        System.out.println("Parent static field = " + Parent.getB());

        Child2 child2 = new Child2();
        System.out.println("Child2 not static field = " + child2.getA());
        System.out.println("Child2 static field = " + Child2.getB());
        System.out.println("Child2 static field = " + Child2.b);

        System.out.println("Child1 static field via hidden getter = " + Child1.getB());

        System.out.println("=============================");
        Child2.staticMethod();
        Child2.staticMethod(7);
    }
}
