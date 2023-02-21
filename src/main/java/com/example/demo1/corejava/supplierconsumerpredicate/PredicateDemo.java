package com.example.demo1.corejava.supplierconsumerpredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate.test(2));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> collect = list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}