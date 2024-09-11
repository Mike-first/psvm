package com.hill.threads.threadapiexamples.p7threadexecutors.formanworkers;

public class Task {
    private final int ordinal;
    private final int executionComplicity;
    private final int checkComplicity;
    private boolean isCompleted;
    private boolean isChecked;

    public Task(int executionComplicity, int checkComplicity, int ordinal) {
        this.executionComplicity = executionComplicity;
        this.checkComplicity = checkComplicity;
        this.ordinal = ordinal;
        this.isCompleted = false;
        this.isChecked = false;
    }

    public int ordinal() {
        return ordinal;
    }

    public int executionComplicity() {
        return executionComplicity;
    }

    public int checkComplicity() {
        return checkComplicity;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void complete() {
        isCompleted = true;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void check() {
        isChecked = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "ordinal=" + ordinal +
                ", executionComplicity=" + executionComplicity +
                ", checkComplicity=" + checkComplicity +
                '}';
    }
}
