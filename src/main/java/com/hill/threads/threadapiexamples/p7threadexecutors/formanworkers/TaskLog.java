package com.hill.threads.threadapiexamples.p7threadexecutors.formanworkers;

import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskLog {
    private int ordinal;
    private final int maxToDo;
    ConcurrentLinkedQueue<Task> toDo = new ConcurrentLinkedQueue<>();
    ConcurrentLinkedQueue<Task> toCheck = new ConcurrentLinkedQueue<>();
    private boolean isActive;

    public TaskLog(int maxToDo) {
        this.maxToDo = maxToDo;
        isActive = true;
    }

    public int nextOrdinal() {
        return ordinal++;
    }

    public void addToDo(Task task) {
        toDo.add(task);
    }

    public Task nextToDo() {
        return toDo.poll();
    }

    public boolean isToDoHasNext() {
        return !toDo.isEmpty();
    }

    public boolean isToDoFull() {
        return toDo.size() >= maxToDo;
    }

    public void addToCheck(Task task) {
        toCheck.add(task);
    }

    public boolean hasNextToCheck() {
        return !toCheck.isEmpty();
    }

    public Task nextToCheck() {
        return toCheck.remove();
    }

    public boolean isWorkDay() {
        return isActive;
    }

    public void endWorkDay() {
        isActive = false;
    }
}
