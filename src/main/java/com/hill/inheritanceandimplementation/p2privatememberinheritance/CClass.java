//diamond inheritance is impossible in Java due to the lack of multiple inheritance
//however, the problem may arise when implementing interfaces that have a default method implementation
//then you will have to override the conflicting method

package com.hill.inheritanceandimplementation.p2privatememberinheritance;

public class CClass implements InterA, InterB {
    //without overriding of public void method() we get compilation error
    //because both interfaces Child1 implements has default method(){}
    @Override
    public void method() {
        System.out.println("conflict of default implementation have to be resolved by overriding method");
    }
}
