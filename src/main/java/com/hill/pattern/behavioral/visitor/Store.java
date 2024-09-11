//implementation of a specific element 2

package com.hill.pattern.behavioral.visitor;

public class Store implements Element {
    @Override
    public void beDone(Worker worker) {
        worker.build(this);
    }
}
