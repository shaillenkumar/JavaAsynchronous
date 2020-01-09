package com.helix.threaddemo;

class ThreadDemo1 extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running!");
            sleep(1000);
        }catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThreadDemo1 {
    public static void main(String[] args) {
        for(int i=0; i<=8; i++){
            ThreadDemo1 obj = new ThreadDemo1();
            obj.start();

        }
    }

}
