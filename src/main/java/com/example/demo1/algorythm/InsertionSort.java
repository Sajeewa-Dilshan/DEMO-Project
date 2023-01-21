package com.example.demo1.algorythm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {


    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(55);
        intList.add(54);
        intList.add(89);
        intList.add(78);

        for(int i=1;i<intList.size();i++){
            int j=i;
            while( j!=0 && (intList.get(j)<intList.get(j-1))){
                int tempArray=intList.get(j);
                intList.set(j,intList.get(j-1));
                intList.set(j-1,tempArray);
                j--;
                System.out.println(1);
            }

        }

        System.out.println(intList);

    }


}

interface  d{
    String s = null;
    void f();
}