package com.example.demo1.trials.collections.stream;

public class MethodReferenceSample {

    public static void main(String[] args) {
        Thread t=new Thread(()->printMessage());
        t.start();
    }

    public  static void printMessage(){
        System.out.println("Hello");
    }

}
