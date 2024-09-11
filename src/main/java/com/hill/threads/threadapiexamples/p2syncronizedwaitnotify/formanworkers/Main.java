package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers;

import com.hill.threads.threadapiexamples.Helper;
import com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Foreman;
import com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.TaskLog;
import com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Worker;

import java.util.ArrayList;
import java.util.List;

//example of a task for threads:
//a foreman and some count of workers - are threads
//a foreman creates tasks of varying complexity of execution and verification (and puts them in the task log)
//tasks have a random complexity of execution and verification (2 fields) and a status of execution and verification (2 fields)
//workers complete tasks in different times, depending on the complexity of the task and the skills of the worker
//having completed the current task and handed it over for verification, the worker takes a new one
//if the worker has completed the previous one, and the queue for execution is empty, then he rests
//the worker's skills increase with each task in proportion to the time spent on it
//the foreman checks tasks (cannot create new ones) or creates new ones (if the queue for execution is not overflown) or rests - in order of priority
//there is a common resource - a task log, in it there are 2 queues - for execution and for verification

//example of wrong usage of synchronized

public class Main {
    public static void main(String[] args) throws InterruptedException {
        com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.TaskLog taskLog = new TaskLog(30);
        com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Foreman foreman = new Foreman("Foreman", taskLog, 50);

        List<com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            workers.add(new com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2.Worker(String.format("Worker %d-th", i), taskLog, Helper.random(3, 10)));
        }

        foreman.start();
        workers.forEach(Thread::start);

        Helper.pause(1000 * 45);
        taskLog.endWorkDay();

        foreman.join();
        for (Worker w : workers) w.join();
    }
}

//try synchronized methods in TaskLog, find following:
//Foreman created Task{ordinal=0, executionComplicity=24643, checkComplicity=785}
//        Exception in thread "Worker 3-th" Exception in thread "Worker 0-th" Exception in thread "Worker 2-th" Exception in thread "Worker 4-th" java.lang.NullPointerException
//        at com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers.Worker.performTask(Worker.java:35)
//        at com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers.Worker.run(Worker.java:21)