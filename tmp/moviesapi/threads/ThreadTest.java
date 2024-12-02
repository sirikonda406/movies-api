package com.mahesh.movies.api.moviesapi.threads;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        BestThreads bestThreads = new BestThreads("MAHESH");
        bestThreads.start();

        BestThreads bestThreads1 = new BestThreads("Jay");
        bestThreads1.start();


      //  bestThreads.join();
        bestThreads1.join();

    }
}
