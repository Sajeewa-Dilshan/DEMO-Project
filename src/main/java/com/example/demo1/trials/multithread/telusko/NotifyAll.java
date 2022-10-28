package com.example.demo1.trials.multithread.telusko;

public class NotifyAll {
    public static void main(String[] args)
            throws InterruptedException
    {

        Geek4 geeks1 = new Geek4();
        Geek5 geeks2 = new Geek5(geeks1);
        Geek6 geeks3 = new Geek6(geeks1);
        Thread t1 = new Thread(geeks1, "Thread-1");
        Thread t2 = new Thread(geeks2, "Thread-2");
        Thread t3 = new Thread(geeks3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}

class Geek1 extends Thread {
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
class Geek2 extends Thread {
    Geek4 geeks1;

    Geek2(Geek4 geeks1){
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
class Geek3 extends Thread {
    Geek4 geeks1;
    Geek3(Geek4 geeks1) { this.geeks1 = geeks1; }
    public void run()
    {
        synchronized (this.geeks1)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");

            this.geeks1.notifyAll();
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
