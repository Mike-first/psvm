// Memento. allows you to save the internal state of an object outside of it, and then restore it, without violating encapsulation.
// the structure of the Originator - Memento - Caretaker template in the classic version or with the allocation of the creator and custodian interfaces

package com.hill.pattern.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state_0");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("state_1");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("state_2");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("state_3");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        System.out.println("\nsomething exploded in current version.\nwe need previous one. lets restore it:\n");

        originator.restoreState(caretaker.getMemento("0"));
        System.out.printf("State is %s\n", originator.getState());
    }
}
