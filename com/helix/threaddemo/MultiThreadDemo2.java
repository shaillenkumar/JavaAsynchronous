package com.helix.threaddemo;

class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId()+ "Thread running");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class MultiThreadDemo2 {
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            Thread obj = new Thread(new ThreadDemo2());
            obj.start();
        }
    }
}
