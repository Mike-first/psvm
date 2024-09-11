//Facade
// defines a high-level interface for the subsystem, simplifies work with the system
// allows you to get a result by calling one method of one class instead of many calls of different methods of different classes
// example from life - a cafe, a waiter and everything else
// it is obvious that the interaction of subsystems can be much more complicated than in the example, but for understanding the pattern of the given code is enough

package com.hill.pattern.structural.facade;

public class CoffeeMachine {
    public void makeCoffee() {
        Boiler.boil();
        CoffeeAdder.addCoffee();
        SugarAdder.addSugar();
        Mixer.mix();
        System.err.println("take your coffee. result as seen by client code");
    }
}
