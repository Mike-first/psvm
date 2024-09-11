//in our example - the base class that we will wrap

package com.hill.pattern.structural.decorator;

public class Bricklayer implements Worker {
    @Override
    public void justDoIt() {
        System.out.println("building the building");
    }
}
