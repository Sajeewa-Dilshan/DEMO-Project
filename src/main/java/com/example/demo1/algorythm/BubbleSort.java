package com.example.demo1.algorythm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(17);
//        list.add(14);
//        list.add(23);
//        list.add(34);
//
//
//        for(int i=0;i<list.size();i++){
//            for(int j=0;j< list.size()-1;j++){
//                if(list.get(j)>list.get(j+1)){
//                    Integer tempInteger = list.get(j+1);
//                    list.set(j+1,list.get(j));
//                    list.set(j,tempInteger);
//                }else {
//
//                }
//            }
//        }
//        System.out.println(list);
//    }

    public static void main(String[] args) {
        int[] intArr={1,45,34,89,69};


        for(int i=0;i<intArr.length;i++){
            for(int j=0;j< intArr.length-1;j++){
                if(intArr[j]>intArr[j+1]){
                    Integer tempInteger = intArr[j+1];
                    intArr[j+1]=intArr[j];
                    intArr[j]=tempInteger;
                }else {

                }
            }
        }

        System.out.println(intArr[1]);
    }
}

