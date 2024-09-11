//Visitor's interface

package com.hill.pattern.behavioral.visitor;

public interface Worker {
    void build(Hospital hospital);

    void build(Store store);

    void build(House house);
}
