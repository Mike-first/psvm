//wrapper that adds functionality

package com.hill.pattern.structural.decorator;

public class Architect extends WorkerDecorator {
    public Architect(Worker worker) {
        super(worker);
    }

    public void createProject() {
        System.out.println("creating a building project");
    }

    @Override
    public void justDoIt() {
        createProject();
        super.justDoIt();
    }
}
