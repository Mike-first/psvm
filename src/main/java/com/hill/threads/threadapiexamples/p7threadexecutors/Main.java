package com.hill.threads.threadapiexamples.p7threadexecutors;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("do something");
            }
        });
        service.shutdownNow();

        ExecutorService service2 = Executors.newFixedThreadPool(2);
        ExecutorService service3 = Executors.newSingleThreadExecutor();

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        System.out.println("now");

        ScheduledFuture<?> future1 = executor.schedule(()->{
            System.out.println("now+10s");
        }, 10, TimeUnit.SECONDS);

        ScheduledFuture<?> future2 = executor.schedule(()->{
            System.out.println("now+20s");
        }, 20, TimeUnit.SECONDS);

        future2.cancel(true);
        executor.shutdown();
    }
}
