//The adapter allows you to make friends with classes with incompatible contracts:
//a class (Adaptee) that provides something does it by calling the doIt() method
//a class (Client) that accepts an object that provides something,
//but the client wants to receive something by the makeIt() method and we cannot change this.
//the problem is solved by the Adapter class, implementing an interface that suits the Client, inherited from Adaptee
//where the do() method will be called in the override of the make() method
//our Adaptee is named UsefulCode


package com.hill.pattern.structural.adapter;

public class Adapter extends UsefulCode implements ClientInterface {
    @Override
    public void makeIt() {
        doIt();
    }

    @Override
    public void removeIt() {
        deleteIt();
    }
}
