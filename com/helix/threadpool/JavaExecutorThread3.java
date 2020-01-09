package com.helix.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutorThread3 {

    public static void main(String[] args) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        for(int i=0; i<10 ; i++) {
            service.execute(new ComputeIntensiveTask()); //Instead of Thread.start()
        }
        // For compute intensive threads choose ThreadPool equals to available cores
        // If there are other process/ programs running then the threads may not get all the cores
        System.out.println("Thread Name: " + Thread.currentThread().getName());

    }
}

class ComputeIntensiveTask implements Runnable{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
}