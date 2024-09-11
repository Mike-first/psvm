package com.hill.threads.threadapiexamples.p2syncronizedwaitnotify.formanworkers2;

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

    public int nextOrdinal() {
        return ordinal++;
    }

    public void addToDo(Task task) {
        toDo.add(task);
        System.out.printf("toDo q count = %d%n", toCheck.size());
    }

    public Task nextToDo(){
        return toDo.poll();
    }

    public boolean isToDoHasNext(){
        return !toDo.isEmpty();
    }

    public boolean isToDoFull() {
        return toDo.size() >= maxToDo;
    }

    public void addToCheck(Task task) {
        toCheck.add(task);
        System.out.printf("toCheck q count = %d%n", toCheck.size());
    }

    public boolean hasNextToCheck(){
        return !toCheck.isEmpty();
    }

    public Task nextToCheck() {
        return toCheck.remove();
    }

    public boolean isWorkDay() {
        return isActive;
    }

    public void endWorkDay(){
        isActive = false;
    }
}
