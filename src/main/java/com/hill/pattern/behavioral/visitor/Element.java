//Element's interface
//interface of the element included in the structure

package com.hill.pattern.behavioral.visitor;

public interface Element {
    void beDone(Worker worker); // worker = visitor
}
