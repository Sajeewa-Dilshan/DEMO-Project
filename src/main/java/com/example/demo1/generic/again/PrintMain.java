package com.example.demo1.generic.again;

public class PrintMain {

    public static void main(String[] args) {
//        Printer printer=new Printer(23);
//        printer.print();
//        Printer printer1=new Printer(45f);
//        printer1.print();
//
//        Printer<Double> printer2=new Printer<>(45.00);

        Car car=new Car();

        Printer<Car> printer=new Printer<>(car);

    }
}
