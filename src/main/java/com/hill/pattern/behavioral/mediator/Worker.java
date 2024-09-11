
//interface of an object that needs mediation. An abstract class is used in order to be able to store non-public fields

package com.hill.pattern.behavioral.mediator;

public abstract class Worker {
    private Mediator mediator;

    public Worker(Mediator director) {
        this.mediator = director;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void receive(String message);
}
