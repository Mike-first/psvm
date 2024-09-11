package com.hill.inheritanceandimplementation.p6accessmodifiers.p6anotherpackage;

import com.hill.inheritanceandimplementation.p6accessmodifiers.BasicClass;

public class ChildClass extends BasicClass {
    public void getProtectedField() {
        //ChildClass extend BasicClass and have access to protected members
        System.out.println(protectedField);
        // accessible anywhere
        System.out.println(publicField);
    }
}
