package com.helix.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutorThread4 {
    public static void main(String[] args) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
        ExecutorService service = Executors.newFixedThreadPool(100);// Choose higher number to minimize Thread wait time.

        for(int i=0; i<100 ; i++) {
            service.execute(new IOIntensiveTask()); //Instead of Thread.start()
        }
        // For IO intensive Tasks choose ThreadPool based on the number of tasks and the wait time for the threads to fetch the task from task queue.
        // since the Threads are more memory expensive.
        // so there is always a trade off between the number of threads in ThreadPool size and  the memory.
        System.out.println("Thread Name: " + Thread.currentThread().getName());

    }
}

class IOIntensiveTask implements Runnable{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
}