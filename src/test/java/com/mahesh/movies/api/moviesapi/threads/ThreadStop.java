package com.mahesh.movies.api.moviesapi.threads;

public class ThreadStop {

    public static int counter = 0;

    public ThreadStop() {

    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                counter = i;
                System.out.println(Thread.currentThread().getName() + "::::" + counter);
            }
        });
        thread.start();
        Thread.sleep(500);
        thread.interrupt();

        for (int i = 0; i <= 10; i++) {
            counter = i;
            System.out.println(Thread.currentThread().getName() + "::::" + counter);
        }

    }
}
