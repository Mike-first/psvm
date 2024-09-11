package com.hill.inheritanceandimplementation.p4abstractclassinstance;

class Instanced {
    public static void main(String[] args) {
        //below is the "instance" of the abstract class. in essence, it is an anonymous implementation
        Abs instance = new Abs() {
            @Override
            public void method() {

            }

            public void oneMoreMethod() {
                //it is allowed to add some specific methods while anonymous implementation,
                //but how it can be called???
            }
        };

        instance.method();

        //there is access to the static field of the abstract class. also: there is access to the static field on behalf of the object, but a warning will be generated
        System.out.println(instance.s);

        //access to the static field of the abs class is available
        System.out.println(instance.s2);
    }
}
