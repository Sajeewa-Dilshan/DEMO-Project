package com.example.demo1.trials.collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();


        for(int i=10;i>0;i--){
            priorityQueue.add(i);
        }

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("john");
        hashSet.add("Leel");
        hashSet.add("Mike");
        hashSet.add("Ben");
        hashSet.add("Kane");

        System.out.println(hashSet.iterator().next());


        TreeSet<String> treeSet =new TreeSet<>();
        treeSet.add("john");
        treeSet.add("mccaw");
        treeSet.add("web");
        treeSet.add("kane");
        System.out.println(treeSet);
        Map<String,String> v=new HashMap<>();
    }
}
