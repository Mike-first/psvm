package com.hill.pattern.behavioral.command;

public class SpeedUp implements Command {
    private final Automobile automobile;

    public SpeedUp(Automobile automobile) {
        this.automobile = automobile;
    }

    @Override
    public void execute() {
        automobile.acceleration();
    }
}
