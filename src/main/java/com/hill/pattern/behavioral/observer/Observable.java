//published interface

package com.hill.pattern.behavioral.observer;

public interface Observable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
