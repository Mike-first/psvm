
//Bill Pugh's solution / On Demand Holder idiom
//no locking when instance is already initialized and 2 threads request it
//fastest


package com.hill.pattern.creational.singleton;

public final class Singleton4 {

    private Singleton4() {
    }

    private static class SingletonHolder {
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }
}
