package com.hill.threads.threadapiexamples;

import java.util.concurrent.TimeUnit;

public class Helper {
    public static void pause(int millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }

    public static int random(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
}
