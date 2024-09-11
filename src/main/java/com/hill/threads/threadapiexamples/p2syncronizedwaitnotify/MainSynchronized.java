package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify;

//shared resource & changeable > race condition
//synchronized (object, this, class for static) method, block
//bottleneck: other threads will wait until shared resource will be released

import com.hill.threads.threadapiexamples.Helper;

public class MainSynchronized {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread-" + i);
            t.start();
        }
    }
}

class CommonResource {
    int x = 0;
}

class CountThread implements Runnable {
    CommonResource res;
    CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d %n", Thread.currentThread().getName(), res.x);
                res.x++;
                Helper.pause(100);
            }
        }
    }
}
