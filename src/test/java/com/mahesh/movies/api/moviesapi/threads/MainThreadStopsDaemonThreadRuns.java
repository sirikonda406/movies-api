package com.mahesh.movies.api.moviesapi.threads;

import java.util.Random;

public class MainThreadStopsDaemonThreadRuns {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread executing:::::" + Thread.currentThread().getName());

        Runnable runnable = () -> {

            for (int i = 0; i < new Random().nextInt(10); i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread executing::::" + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        thread.join();
        Thread.sleep(3100);
    }
}
