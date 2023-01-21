package com.example.demo1.trials.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSample {

//    public static void main(String[] args) {
//        Predicate<String> predicate1 = str -> str.startsWith("A");
//        Predicate<String> predicate2 = str -> str.length()<5;
//
//        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
//
//        List<String> collect = names.stream().filter(predicate1.negate().or(predicate2)).collect(Collectors.toList());
//        System.out.println(collect);
//    }

//    public static void main(String[] args) {
//        Predicate<String> predicate1 = str -> str.startsWith("A");
//        Predicate<String> predicate2 = str -> str.length()<5;
//
//        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
//
//        List<String> a = names.stream()
//                .filter(((Predicate<String>) name -> name.startsWith("A"))
//                        .and(name -> name.length() < 5)).collect(Collectors.toList());
//
//        System.out.println(a);
//    }

    public static void main(String[] args) {

//        Predicate<String> predicate1 = str -> str.startsWith("A");
//        Predicate<String> predicate2 = str -> str.length()<5;
//
//        List<Predicate<String>> allPredicates =new ArrayList<>();
//
//
//
//        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
//
//        List<String> a = names.stream()
//                .filter(allPredicates.stream().reduce(x->false,Predicate::or))
//                     .collect(Collectors.toList());
//
//        System.out.println(a);
        String property = System.getProperty("catalina.base");
        System.out.println(property);
    }
}
