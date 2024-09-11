package com.hill.threads.threadapiexamples.p7threadexecutors.formanworkers;

import com.hill.threads.threadapiexamples.Helper;
import com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Foreman;
import com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.TaskLog;
import com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Worker;

import java.util.ArrayList;
import java.util.List;

//same example as previous. synchronization via thread-safe queue

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskLog taskLog = new TaskLog(30);
        Foreman foreman = new Foreman("Foreman", taskLog, 50);

        List<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            workers.add(new Worker(String.format("Worker %d-th", i), taskLog, Helper.random(3, 10)));
        }

        foreman.start();
        workers.forEach(Thread::start);

        Helper.pause(1000 * 45);
        taskLog.endWorkDay();

        foreman.join();
        for (Worker w : workers) w.join();
    }
}
