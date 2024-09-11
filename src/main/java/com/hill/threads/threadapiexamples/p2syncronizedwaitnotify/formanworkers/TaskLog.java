package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskLog {
    private int ordinal;
    private final int maxToDo;
    Deque<Task> toDo = new ArrayDeque<>();
    Deque<Task> toCheck = new ArrayDeque<>();
    private boolean isActive;

    public TaskLog(int maxToDo) {
        this.maxToDo = maxToDo;
        isActive = true;
    }

    public synchronized int nextOrdinal() {
        return ordinal++;
    }

    public synchronized void addToDo(Task task) {
        toDo.add(task);
    }

    public synchronized Task nextToDo(){
        return toDo.poll();
    }

    public synchronized boolean isToDoHasNext(){
        return !toDo.isEmpty();
    }

    public synchronized boolean isToDoFull() {
        return toDo.size() >= maxToDo;
    }

    public synchronized void addToCheck(Task task) {
        toCheck.add(task);
    }

    public synchronized boolean hasNextToCheck(){
        return !toCheck.isEmpty();
    }

    public synchronized Task nextToCheck() {
        return toCheck.remove();
    }

    public synchronized boolean isWorkDay() {
        return isActive;
    }

    public synchronized void endWorkDay(){
        isActive = false;
    }
}
