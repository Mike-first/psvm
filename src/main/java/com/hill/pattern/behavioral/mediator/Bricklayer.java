//implementation of an object that requires mediation

package com.hill.pattern.behavioral.mediator;

public class Bricklayer extends Worker {
    public Bricklayer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Bricklayer receive: " + message);
    }

}
