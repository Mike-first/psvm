package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2;

import com.hill.automationqa.utils.Web;
import com.hill.threads.threadapiexamples.Helper;

public class Worker extends Thread {
    private final String name;
    private final TaskLog taskLog;
    private int skills;

    public Worker(String name, TaskLog taskLog, int skills) {
        this.name = name;
        this.taskLog = taskLog;
        this.skills = skills;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        System.out.printf("%s begins his work day\n", this.name);
        while (taskLog.isWorkDay()) {

            Task currentTask = null;
            synchronized (taskLog) {
                if (taskLog.isToDoHasNext()) {
                    currentTask = taskLog.nextToDo();
                }
            }

            if (currentTask != null) {
                currentTask = performTask(currentTask);
            } else rest();

            if (currentTask != null) {
                synchronized (taskLog) {
                    taskLog.addToCheck(currentTask);
                }
            }

        }
        System.out.printf("%s finished his work day\n", this.name);
    }

    private Task performTask(Task task) {
        if (task.isCompleted()) throw new RuntimeException("task should not be completed");

        System.out.printf("%s start task %s%n", this.name, task);
        Web.pause(task.executionComplicity() / skills);
        task.complete();
        System.out.printf("%s completed task %s%n", this.name, task);
        skills += task.executionComplicity() / skills / 100;
        return task;
    }

    private void rest() {
        System.out.printf("%s have rest...%n", this.name);
        Helper.pause(1000);
    }


}
