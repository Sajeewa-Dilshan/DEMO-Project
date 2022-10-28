package com.example.demo1.trials.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(5, "E");

//map 2
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(1, "G"); //It will replace the value 'A'
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D"); //A new pair to be added
        map2.put(8, "t"); //A new pair to be added

//Merge maps
        map2.forEach(
                (key, value) -> map1.merge( key, value, (v1, v2) -> v2)
        );
        System.out.println(map1);

        Map<Integer,Integer> integerIntegerMap=new HashMap<>();
        integerIntegerMap.put(1,2);
        integerIntegerMap.put(1,2);
        System.out.println(integerIntegerMap);
    }
}
