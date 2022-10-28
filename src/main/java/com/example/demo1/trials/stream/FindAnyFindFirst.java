package com.example.demo1.trials.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        Optional<Integer> result =list.stream().findAny();

        List<String> lst1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill","Dany","Julia","Jenish","Divya");
        Optional<String> d = lst1.stream().filter(s -> s.startsWith("D")).findAny();
        System.out.println(d);
    }
}
