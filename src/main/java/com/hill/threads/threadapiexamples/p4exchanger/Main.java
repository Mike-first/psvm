package com.hill.threads.threadapiexamples.p4exchanger;

import com.hill.collections.myimplementation.objectsexamples.Student;
import com.hill.threads.threadapiexamples.Helper;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Exchanger;


//Exchanger. for messaging. typed.

public class Main {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new Talker(ex, "John", 5).start();
        new Talker(ex, "Bob", 10).start();
    }
}

class Talker extends Thread {
    String name;
    Exchanger<String> exchanger;
    private final Deque<String> myNews;

    public Talker(Exchanger<String> ex, String name, int newsCount) {
        this.exchanger = ex;
        this.name = name;
        myNews = new ArrayDeque();
        for (int i = 0; i < newsCount; i++) {
            myNews.addLast(Student.randomString());
        }
    }

    public void run() {
        String theirMessage = null;
        String myMessage = null;
        do {
            try {
                myMessage = myNews.poll();
                theirMessage = exchanger.exchange(myMessage);
                System.out.println(String.format("%s says '%s' and hear '%s'",
                        this.name,
                        (myMessage != null) ? myMessage : "nothing",
                        (theirMessage != null) ? theirMessage : "nothing"));
                Helper.pause(1000);
            } catch (InterruptedException ignored) {
            }
        } while (theirMessage != null | myMessage != null);

    }
}
