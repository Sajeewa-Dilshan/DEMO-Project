package com.example.demo1.generic.again;

public class Printer  <T extends Van & Vehicle>{
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
