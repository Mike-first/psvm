
//mediator interface. selecting an interface allows you to replace a specific mediator with another (to change the logic of mediation)

package com.hill.pattern.behavioral.mediator;

public abstract class Mediator {
    public abstract void send(String message, Worker worker);
}
