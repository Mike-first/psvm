package com.hill.threads.threadapiexamples.p7threadexecutors.formanworkers;

import com.hill.threads.threadapiexamples.Helper;

public class Foreman extends Thread {
    private final String name;
    private final TaskLog taskLog;
    private int skills;

    public Foreman(String name, TaskLog taskLog, int skills) {
        this.name = name;
        this.taskLog = taskLog;
        this.skills = skills;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        System.out.printf("%s begins his work day\n", this.name);
        while (taskLog.isWorkDay()) {
            if (taskLog.hasNextToCheck()) {
                check(taskLog.nextToCheck());
            } else if (!taskLog.isToDoFull()) {
                taskLog.addToDo(createTask());
            } else rest();
        }
        System.out.printf("%s finished his work day\n", this.name);
    }

    private Task createTask() {
        int thisTaskOrdinal = taskLog.nextOrdinal();
        Helper.pause(Helper.random(500, 2000));
        Task t = new Task(Helper.random(10000, 25000), Helper.random(500, 2000), thisTaskOrdinal);
        System.out.printf("%s created %s\n", this.name, t);
        skills++;
        return t;
    }

    private void check(Task task) {
        if (!task.isCompleted()) throw new RuntimeException("task should be completed");

        System.out.printf("%s start checking task %d\n", this.name, task.ordinal());
        Helper.pause(task.checkComplicity() / this.skills);
        task.check();
        System.out.printf("%s checked task %d\n", this.name, task.ordinal());
        skills++;
    }

    private void rest() {
        System.out.printf("%s have rest...%n\n", this.name);
        Helper.pause(1000);
    }
}
