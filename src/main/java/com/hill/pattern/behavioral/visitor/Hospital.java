//implementation of a specific element 1

package com.hill.pattern.behavioral.visitor;

public class Hospital implements Element {
    @Override
    public void beDone(Worker worker) {
        worker.build(this);
    }
}
