//Double Checked singleton
//thread-safe
//synchronized block is executed only on initialization
//using volatile modifier can lead to performance problems on multiprocessor systems / https://habr.com/ru/post/27108/
//why it doesn't work without volatile: https://habr.com/ru/post/129494/

//when working in threads, each creates its own cached copy of the variable and works with no. volatile modifier indicates that
//local copies of the variable in threads should not be created, and each access to the variable (read/write) accesses
//directly to the original variable (the "antonym" of this is ThreadLocal)

package com.hill.pattern.creational.singleton;

public class Singleton5 {

    private static volatile Singleton5 instance;

    private Singleton5() {
        if (instance != null) throw new RuntimeException();
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) instance = new Singleton5();
            }
        }
        return instance;
    }
}
