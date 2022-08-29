package com.mahesh.movies.api.moviesapi.threads;

public class BestThreads extends Thread {

    private String threadName;

    public BestThreads(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(threadName + ":::" + i);
        }
    }
}
