
package com.hill.pattern.creational.singleton.example;

public class Main {
    static Logger logger = Logger.getLogger();

    public static void main(String[] args) {
        logger.log("проверка связи 1, все ОК. из мейн", false);
        toTestLogger();
    }

    public static void toTestLogger() {
        //same thread, just renamed for clarity
        Thread.currentThread().setName("other_thread");
        logger.log("проверка связи 2, ошибка произошла", true);
    }
}
