package com.hill.threads.threadapiexamples.p3semaphore;

import com.hill.threads.threadapiexamples.Helper;

import java.util.concurrent.Semaphore;

//Semaphore limits the number of accesses to the resource

public class Main {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        CommonResource res = new CommonResource();
        new Thread(new CountThread(res, sem, "First")).start();
        new Thread(new CountThread(res, sem, "Second")).start();
        new Thread(new CountThread(res, sem, "Third")).start();
    }
}

class CommonResource {
    int x = 0;
}

class CountThread implements Runnable {
    CommonResource res;
    Semaphore sem;
    String name;

    CountThread(CommonResource res, Semaphore sem, String name) {
        this.res = res;
        this.sem = sem;
        this.name = name;
    }

    public void run() {
        try {
            System.out.println(name + " waits for permission");
            sem.acquire();
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + " use resource: " + res.x);
                res.x++;
                Helper.pause(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " release permission");
        sem.release();
    }
}
