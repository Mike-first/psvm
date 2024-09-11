package com.hill.threads.threadapiexamples.p1threadscreating;

import com.hill.threads.threadapiexamples.Helper;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        Helper.pause(1000);
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}
