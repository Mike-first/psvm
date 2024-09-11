package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2;

import com.hill.threads.threadapiexamples.Helper;

import java.util.ArrayList;
import java.util.List;

//same example as previous. refactored:
//try synchronized blocks. works fine, workers and foreman are not blocking taskLog while create/perform/check task
//only while add/take

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskLog taskLog = new TaskLog(30);
        Foreman foreman = new Foreman("Foreman", taskLog, 100);

        List<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            workers.add(new Worker(String.format("Worker %d-th", i), taskLog, Helper.random(3, 10)));
        }

        foreman.start();
        workers.forEach(Thread::start);

        Helper.pause(1000 * 30);
        taskLog.endWorkDay();

        foreman.join();
        for (Worker w : workers) w.join();
    }
}
