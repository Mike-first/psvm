//thread-safe
//lazy
//synchronization is needed for initialization, then it takes time

package com.hill.pattern.creational.singleton;

public final class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
