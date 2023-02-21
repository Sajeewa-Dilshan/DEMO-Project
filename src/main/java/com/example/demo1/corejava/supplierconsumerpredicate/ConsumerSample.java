package com.example.demo1.corejava.supplierconsumerpredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer=t->{System.out.println("Printing "+t);};
        consumer.accept(10);

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().forEach(consumer);
    }
}