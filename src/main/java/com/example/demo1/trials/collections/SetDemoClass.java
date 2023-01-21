package com.example.demo1.trials.collections;

import java.util.*;

public class SetDemoClass {

    public static void main(String[] args) {
        Set<String > s= new TreeSet<>();
        s.add("null");
        s.add("null");
        System.out.println(s);

        Map<String,String > map= new TreeMap<>();
        map.put("f","F");
        map.put("f","Fggg");
        System.out.println(map);

        Map<String,String > map1= new HashMap<>();

        map1.put("f","F");
        map1.put("f","Fggg");
        System.out.println(map1);
    }
}
