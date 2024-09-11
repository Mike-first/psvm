//implementation of an object that requires mediation

package com.hill.pattern.behavioral.mediator;

public class Carpenter extends Worker {
    public Carpenter(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Carpenter receive: " + message);
    }
}
