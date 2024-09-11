package com.hill.threads.threadapiexamples.p6reentrantlock;

import com.hill.threads.threadapiexamples.Helper;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonResource {
    int x = 0;
}

class CountThread implements Runnable {
    CommonResource res;
    ReentrantLock locker;

    CountThread(CommonResource res, ReentrantLock lock) {
        this.res = res;
        locker = lock;
    }

    public void run() {
        locker.lock();
        try {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d %n", Thread.currentThread().getName(), res.x);
                res.x++;
                Helper.pause(100);
            }
        } finally {
            locker.unlock();
        }
    }
}
