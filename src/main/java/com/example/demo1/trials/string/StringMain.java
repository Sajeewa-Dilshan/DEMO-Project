package com.example.demo1.trials.string;

import org.apache.commons.lang3.StringUtils;

public class StringMain {

//    public static void main(String[] args) {
//        String s="l";
//        String s1="l";
//
//        String d=new String("d");
//        String d1=new String("d");
//
//        StringBuffer stringBuffer =new StringBuffer("sb");
//        StringBuffer stringBuffer1 =new StringBuffer("sb");
//
//        StringBuilder stringBuilder =new StringBuilder("sb");
//        StringBuilder stringBuilder1 =new StringBuilder("sb");
//
//        System.out.println(s1==s);
//        System.out.println(d1==d);
//        System.out.println(stringBuffer==stringBuffer1);
//        System.out.println(stringBuilder==stringBuilder1);
//
//        final String S="Success";
//        String s2=null;
//
//        System.out.println(S.equals(null));
//    }

    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2=new String("Hello");
        int int1=7;
        int int2=7;

        String s="";
        System.out.println(StringUtils.isAllEmpty(s));

        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        } else{
            System.out.println("s1 and s2 are not equal");
        }
    }
}
