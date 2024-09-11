package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers;

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
            if (taskLog.isToDoHasNext()) {
                complete(performTask(taskLog.nextToDo()));
            } else {
                rest();
            }
        }
        System.out.printf("%s finished his work day\n", this.name);
    }

    private void complete(Task task) {
        if (!task.isCompleted()) throw new RuntimeException("task should be completed");
        taskLog.addToCheck(task);
    }

    private Task performTask(Task task) {
        if (task.isCompleted()) throw new RuntimeException("task should not be completed");

        System.out.printf("%s start task %d%n", this.name, task.ordinal());
        Web.pause(task.executionComplicity() / skills);
        task.complete();
        System.out.printf("%s completed task %d%n", this.name, task.ordinal());
        skills ++; //= task.executionComplicity() / skills / 100;
        return task;
    }

    private void rest() {
        System.out.printf("%s have rest...%n", this.name);
        Helper.pause(1000);
    }


}
