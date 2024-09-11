//implementation of a specific element 3

package com.hill.pattern.behavioral.visitor;

public class House implements Element {
    @Override
    public void beDone(Worker worker) {
        worker.build(this);
    }
}
