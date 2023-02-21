package com.example.demo1.generic.codewithjohn;

public class GenericExample {

    public static void main(String[] args){
        IntegerPrinter integerPrinter=new IntegerPrinter(23);
        integerPrinter.print();

        Printer<Integer> printer=new Printer(23);
        printer.print();

    }

    private static <T,V> T shout(T thingToShout,V otherThingToShout){
        System.out.println(thingToShout+"! ! ! !");
        System.out.println(otherThingToShout+"! ! ! !");
        return thingToShout;
    }
}