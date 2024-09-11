//let's allow ourselves to deviate from the classic example and implement the class so that it returns not the previous version, but a specific one

package com.hill.pattern.behavioral.memento;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Caretaker {
    private HashMap<String, Memento> mementos = new HashMap<>();

    public Memento getMemento(String version) {
        Memento toReturn = mementos.get(version);
        if (toReturn != null) {
            return toReturn;
        } else {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss SSS");
            String date = java.time.LocalTime.now().format(dtf);
            return new Memento("NO such versin", version, date);
        }

    }

    public void setMemento(Memento memento) {
        mementos.put(memento.getVersion(), memento);
    }
}
