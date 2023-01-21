package com.example.demo1.trials.multithread.telusko;

public class ThreadJoin {
    public static void main(String[] args) {

    Thread t1 =new Thread(()->
    {
        for(int i =0; i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread t2 =new Thread(()->
    {
        for(int i =0; i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    t1.start();
    t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    System.out.println("Bye");

    }
}
