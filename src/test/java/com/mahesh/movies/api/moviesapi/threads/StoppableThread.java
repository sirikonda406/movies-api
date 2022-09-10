package com.mahesh.movies.api.moviesapi.threads;

public class StoppableThread {
    public static class StoppableRunnable implements Runnable {
        private boolean threadStopRequest = false;

        @Override
        public void run() {
            while (!isThreadStopRequest()) {
                sleepThread(200);
                System.out.println("executing thread ........");
            }
            System.out.println("executing thread stopped !!!!!!!");
        }

        public void sleepThread(long millsec){
            try {
                Thread.sleep(millsec);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        private boolean isThreadStopRequest() {
            return threadStopRequest;
        }

        public void stopThreadRequested() {
            threadStopRequest = true;
        }
    }


    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread stoppableThread = new Thread(stoppableRunnable, "The thread");
        stoppableThread.start();
        stoppableRunnable.sleepThread(1000);
        System.out.println("Requesting stop");
        stoppableRunnable.stopThreadRequested();
        System.out.println("stop requested");

    }
}
