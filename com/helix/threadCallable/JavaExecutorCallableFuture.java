package com.helix.threadCallable;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.Future;

public class JavaExecutorCallableFuture {
    public static void main(String[] args) {
        ExecutorService  service = Executors.newFixedThreadPool(10);
        //Submit Tasks and accept placeholder object for the Return value
        Future<Integer> future = service.submit(new Task());
        try{
            /* get the task return value */
            Integer result = future.get();     // Future.get() is blocking
            System.out.println("The result of the task is "+result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
// Task
class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
