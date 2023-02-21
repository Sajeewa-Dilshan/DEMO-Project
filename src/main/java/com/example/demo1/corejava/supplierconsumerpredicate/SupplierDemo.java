package com.example.demo1.corejava.supplierconsumerpredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return null;
    }

    public static void main(String[] args) {

        Supplier<String> supplier=()->{return "t";};
        Supplier<String> supplier1=()->"t";
        List<String> list= Arrays.asList("a","b","c","d");

        String s = list.stream().findAny().orElseGet(supplier);
        System.out.println(s);

    }
}
