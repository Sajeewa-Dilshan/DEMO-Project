package com.example.demo1.trials.multithread;

public class Multithreading extends Thread{
    private int threadNumber;

    public Multithreading(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(i+" from thread number "+threadNumber);
            if(threadNumber==3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
