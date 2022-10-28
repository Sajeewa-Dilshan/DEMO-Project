package com.example.demo1.trials.multithread;

public class MultithreadingMain {

//    public static void main(String[] args) {
////        Multithreading myThing= new Multithreading();
////        Multithreading myThing2= new Multithreading();
////        myThing.start();
////        myThing2.run();
//        for(int i=0;i<=3;i++){
//            Multithreading myThing3 =new Multithreading(i);
//            myThing3.start();
//
//        }
//        throw new RuntimeException();
//
//    }

//    public static void main(String[] args) {
//        for(int i=0;i<=3;i++){
//            MultithreadingRunnable myThing3 =new MultithreadingRunnable(i);
//            Thread myThread3=new Thread(myThing3);
//            myThread3.start();
////            try {
////                myThread3.join();
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//            System.out.println(myThread3.isAlive());
//        }
//    }



    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            MultithreadingRunnable myThing3 =new MultithreadingRunnable(i*5);
            Thread myThread3=new Thread(myThing3);
            myThread3.setPriority(Thread.MAX_PRIORITY);
            myThread3.start();

            MultithreadingRunnable myThing4 =new MultithreadingRunnable(i);
            Thread myThread4=new Thread(myThing4);

            myThread4.setPriority(2);
            myThread4.start();

            System.out.println(myThread3.isAlive());
        }
    }
}
