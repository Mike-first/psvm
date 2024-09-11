package com.hill.inheritanceandimplementation.p6accessmodifiers.p6anotherpackage;

import com.hill.inheritanceandimplementation.p6accessmodifiers.BasicClass;

public class Test {
    public static void main(String[] args) {
        BasicClass bc = new BasicClass();
        System.out.println(bc.publicField); //public only
    }
}
