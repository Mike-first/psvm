package com.hill.threads.threadapiexamples.p1threadscreating;

import com.hill.threads.threadapiexamples.Helper;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        Helper.pause(5000);
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
