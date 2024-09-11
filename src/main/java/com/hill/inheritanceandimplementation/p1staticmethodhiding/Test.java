//overriding a static method is not possible, but hiding is possible
//overriding a static field is not possible - see BClass

package com.hill.inheritanceandimplementation.p1staticmethodhiding;

public class Test {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println("AClass not static field = " + aClass.getA());
        System.out.println("AClass static field = " + AClass.getB());

        BClass bClass = new BClass();
        System.out.println("BClass not static field = " + bClass.getA());
        System.out.println("BClass static field = " + BClass.getB());
        System.out.println("BClass static field = " + BClass.b);

        System.out.println("CClass static field via hidden getter = " + CClass.getB());
    }
}
