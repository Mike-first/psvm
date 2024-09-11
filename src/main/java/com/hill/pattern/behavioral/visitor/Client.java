//Visitor. pattern uses dual dispatch
//allows you to place new behavior in a separate class without changing the behavior in each class
//describes an operation that is performed on objects of other classes, this operation depends on the specific class

package com.hill.pattern.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        City city = new City();
        Worker bricklayer = new Bricklayer();
        Worker carpenter = new Carpenter();
        System.out.println("\nCarpenter");
        city.beDone(carpenter);
        System.out.println("\nBricklayer");
        city.beDone(bricklayer);
    }
}
