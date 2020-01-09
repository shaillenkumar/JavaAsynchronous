package com.helix.threadpool;

public class JavaExecutorThread1 {

    public static void main(String[] args) {
        for(int i=0; i<10 ; i++) {
            Thread thread1 = new Thread(new TaskA());
            thread1.start();
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }

    }
}

class TaskA implements Runnable{

    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
}




