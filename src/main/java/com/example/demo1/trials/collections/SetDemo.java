package com.example.demo1.trials.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> integerSet= new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(2);
        System.out.println(integerSet);
    }
}
