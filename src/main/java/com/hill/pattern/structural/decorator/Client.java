//Decorator
//allows you to add functionality to objects dynamically, by wrapping them or changing it (overriding)
//the decorator implements the interface of the base object, and wrappers are inherited from it
//unlike a proxy
//cannot create the base object itself, but receives it in the constructor
//does not restrict access

package com.hill.pattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Worker worker = new Architect(new Foreman(new Bricklayer()));
        worker.justDoIt();
    }
}
