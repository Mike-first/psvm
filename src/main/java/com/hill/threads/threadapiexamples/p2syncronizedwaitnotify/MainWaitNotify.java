package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify;

//Storage - shared resource, synchronization via wait/notify

public class MainWaitNotify {
    public static void main(String[] args) {
        Storage storage = new Storage();
        new Thread(new Producer(storage)).start();
        new Thread(new Consumer(storage)).start();
    }
}

class Storage {
    private int itemCount = 0;

    public synchronized void get() {
        while (itemCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        itemCount--;
        System.out.println("one item was consumed\nitems count: " + itemCount);
        notify();
    }

    public synchronized void put() {
        while (itemCount >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        itemCount++;
        System.out.println("one item was produced\nitems count: " + itemCount);
        notify();
    }
}

class Producer implements Runnable {
    Storage storage;

    Producer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            storage.put();
        }
    }
}

class Consumer implements Runnable {
    Storage storage;

    Consumer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            storage.get();
        }
    }
}
