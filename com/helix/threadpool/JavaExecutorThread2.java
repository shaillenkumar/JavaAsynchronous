package com.helix.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutorThread2 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(100);

        for(int i=0; i<10 ; i++) {
            service.execute(new TaskB()); //Instead of Thread.start()
        }

        System.out.println("Thread Name: " + Thread.currentThread().getName());

    }
}

class TaskB implements Runnable{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
}




