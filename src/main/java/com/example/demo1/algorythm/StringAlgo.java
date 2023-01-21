package com.example.demo1.algorythm;

import java.util.List;

public class StringAlgo {

    public static void main(String[] args) {
        String s= "asdffgr";
        List<String> split = List.of(s.split(""));

        System.out.println(split);
        String s1="";
        for(int i=split.size()-1;i>-1;i--){

                s1=s1+split.get(i);
        }
        System.out.println(s1);

    }
}
