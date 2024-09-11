// example of using a singleton - a logger,
// which receives a string as an argument - a message and logs it, supplementing it with some information. can be used for debugging.
// for greater readability and clarity, that no record is lost, all logs will start with a serial number.
// if there is more than one instance of the logger, the numbers will become confused, so we will use a singleton.
// if you need to debug multi-threaded code, then the logger must be thread-safe. Double Checked singleton is applicable
//
// and you can also specify in which thread to output the message (output or errors)


package com.hill.pattern.creational.singleton.example;

import java.time.format.DateTimeFormatter;

public final class Logger {
    private int counter;
    private static Logger instance;

    private Logger() {
        if (instance != null) throw new RuntimeException();
    }

    public void log(String str, boolean isErr) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        final String methodName = (stack[2].getMethodName().equalsIgnoreCase("log")) ? stack[3].getMethodName() : stack[2].getMethodName();
        //final String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss SSS");
        String dateStr = java.time.LocalTime.now().format(dtf);
        dateStr = dateStr.substring(0, dateStr.indexOf(' ')) + ":" + dateStr.substring(dateStr.indexOf(' ') + 1);
        String threadName = Thread.currentThread().getName();
        if (isErr) {
            System.err.printf("%d) %s [%s] [%s]: %s\n", ++counter, dateStr, threadName, methodName, str);
        } else {
            System.out.printf("%d) %s [%s] [%s]: %s\n", ++counter, dateStr, threadName, methodName, str);
        }
    } //log (String, boolean)

    public void log(String str) {
        log(str, true);
    }

    public static Logger getLogger() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) instance = new Logger();
            }
        }
        return instance;
    }//getLogger

} //class
