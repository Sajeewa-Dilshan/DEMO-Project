package com.example.demo1.generic.codewithjohn;

public class Printer<T>{

    T thingToPrint;

    public  Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public  void print(){
        System.out.println(thingToPrint);
    }
}
