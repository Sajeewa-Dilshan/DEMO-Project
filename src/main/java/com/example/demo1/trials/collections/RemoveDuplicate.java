package com.example.demo1.trials.collections;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args){
        List<Integer> list = Lists.newArrayList(5,0,3,3,4,5);
        System.out.println(list);

        List<Integer> list1= new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list1);

        RemoveDuplicate removeDuplicate= new RemoveDuplicate();
        removeDuplicate.removeDuplicatesByLambda();

    }

    void removeDuplicatesByLambda(){
        List<Integer> list= Lists.newArrayList(5,0,3,3,4,5);

        List<Integer> list1= list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);

    }
}
