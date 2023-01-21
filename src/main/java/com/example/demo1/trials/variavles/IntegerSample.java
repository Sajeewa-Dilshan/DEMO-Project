package com.example.demo1.trials.variavles;

public class IntegerSample {

    public static void main(String[] args) {
        Integer value=9;
        increaseValue(value++);
        System.out.println(value);
    }



    static void increaseValue(Integer value){
        value=value+5;
        System.out.println(value);
    }
}
