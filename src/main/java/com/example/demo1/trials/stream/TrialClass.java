package com.example.demo1.trials.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TrialClass {

    public static void main(String[] args) {
        Iterator<Integer> iterator = Arrays.asList(1,2,3).iterator();

        List<Integer> actualList = new ArrayList<Integer>();
        iterator.forEachRemaining(actualList::add);
        System.out.println(actualList);

        Iterator<Integer> iterator2 =Arrays.asList(4,5,6).iterator();
        Iterable<Integer> iterable=()-> iterator2;
        List<Integer> actualList2 = StreamSupport
                .stream(iterable.spliterator(),false).collect(Collectors.toList());
        System.out.println(actualList2);
        Iterator<Integer> i=Arrays.asList(11,21,31).iterator();

        Iterable<Integer> c =()->i;
        List<Integer> collect = StreamSupport.stream(c.spliterator(), false).collect(Collectors.toList());
        System.out.println(collect);

    }
}
