package com.example.demo1.trials.multithread.telusko;

public class Notify {
    public static void main(String[] args)
            throws InterruptedException
    {

        Geek4 geeks4 = new Geek4();
        Geek5 geeks5 = new Geek5(geeks4);
        Geek6 geeks6 = new Geek6(geeks4);
        Thread t4 = new Thread(geeks4, "Thread-4");
        Thread t5 = new Thread(geeks5, "Thread-5");
        Thread t6 = new Thread(geeks6, "Thread-6");
        t4.start();
        t5.start();
        Thread.sleep(100);
        t6.start();
    }
}

class Geek4 extends Thread {
    public void run()
    {
        synchronized (this)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
class Geek5 extends Thread {
    Geek4 geeks1;

    Geek5(Geek4 geeks1){
        this.geeks1 = geeks1;
    }

    public void run()
    {
        synchronized (this.geeks1)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");

            try {
                this.geeks1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
class Geek6 extends Thread {
    Geek4 geeks4;
    Geek6(Geek4 geeks4) { this.geeks4 = geeks4; }
    public void run()
    {
        synchronized (this.geeks4)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");
            this.geeks4.notify();

            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
