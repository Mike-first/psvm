//the decorator class implements the base class interface

package com.hill.pattern.structural.decorator;

public class WorkerDecorator implements Worker {
    Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void justDoIt() {
        worker.justDoIt();
    }
}
