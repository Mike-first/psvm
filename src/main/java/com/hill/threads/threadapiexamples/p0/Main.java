package com.hill.threads.threadapiexamples.p0;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("my new name");
        System.out.println(t.getName());
    }
}
