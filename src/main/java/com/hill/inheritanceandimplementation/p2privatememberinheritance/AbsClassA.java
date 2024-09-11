package com.hill.inheritanceandimplementation.p2privatememberinheritance;

public abstract class AbsClassA {
    private int y;
    //keywords public static final are not redundant because field can be not static, not public, not final
    public static final int z = 10;

    //an abstract class instance cannot be created, but a constructor exists
    // and can be called as the first line in the constructor of a derived class

    public AbsClassA(int y) {
        this.y = y;
    }


    //this is an abstract method

    public abstract void method1();

    public void method2() {
        System.out.println("это метод с реализацией");
    }
}
