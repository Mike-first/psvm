package com.hill.threads.threadapiexamples.p1threadscreating;

//two ways to create thread: new Thread(Runnable,"name") or MyThread extends Thread
//finish thread: interrupt() or some isActive flag + setter
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("DatabaseExample thread started...");

        new MyThread("MyThread")
                .start();

        Thread myThread2 = new Thread(new MyThread2(),"MyThread2");
        myThread2.start();
        myThread2.join(); //THIS thread will wait for myThread2 end

        new Thread(()->{}, "").start(); //Runnable as lambda

        System.out.println("DatabaseExample thread finished...");
    }
}
