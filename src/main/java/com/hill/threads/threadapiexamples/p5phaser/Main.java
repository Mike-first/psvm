package com.hill.threads.threadapiexamples.p5phaser;

import com.hill.threads.threadapiexamples.Helper;

import java.util.concurrent.Phaser;

//Phaser. for performing a task phase by phase

public class Main {
    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        new PhaseThread(phaser, "Thr1").start();
        new PhaseThread(phaser, "Thr2").start();
        new PhaseThread(phaser, "Thr3").start();

        int current = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + current + " is completed");

        current = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + current + " is completed");

        current = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + current + " is completed");

        current = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + current + " is completed");

        current = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + current + " is completed");

        phaser.arriveAndDeregister();
    }
}

class PhaseThread extends Thread {
    Phaser phaser;
    String name;

    int phaseCount;

    PhaseThread(Phaser p, String n) {
        this.phaser = p;
        this.name = n;
        phaser.register();
        phaseCount = 4;
    }

    public void run() {
        while (phaseCount-- >= 0) {
            System.out.println("thread " + name + ". phase in progress: " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            Helper.pause(2000);
        }
        phaser.arriveAndDeregister();
    }
}
