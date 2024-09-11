package com.hill.inheritanceandimplementation.p2privatememberinheritance;

public class BClass extends AClass {
    @Override
    public void method() {
        System.out.println("Child2 overridden method was called");
    }

    public void newMethod() {
        System.out.println("method added in Child2, but absent in Parent");
    }
}
