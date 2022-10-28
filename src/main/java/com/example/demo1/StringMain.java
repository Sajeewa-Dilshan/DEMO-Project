package com.example.demo1;

import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StringMain {
//    public static void main(String[] args) {
//        String helloWorld = "Hello World";
//        String target = "e";
//        String replacement = "";
//        String replacedString = helloWorld.replace(target, replacement);
//        System.out.println(replacedString);
//    }

//    public static void main(String[] args) {
//        String helloWorld = "Java is one of best languages";
//        String regex = "(languages)$";
//        String replacement = "programming languages";
//        String replacedString = helloWorld.replace(regex, replacement);
//        System.out.println(replacedString);
//    }

//    public static void main(String[] args) {
////        String sentence = "Java is one of best languages. OOP can be used in Java";
////        String regexTarget = "\\bJava\\b";
////        String exactWordReplaced = sentence.replaceAll(regexTarget, "Python");
////        System.out.println(exactWordReplaced);
//
//        String original = "Java is one of best languages. OOP can be used in Java";
//        String regexTarget = "\\bJava\\b";
//        String replacedWord = original.replaceAll(regexTarget, "Python");
//        System.out.println(replacedWord);
//    }

//    public static void main(String[] args) {
//        String s ="22DFDF";
//        System.out.println(s.contains("L2"));
//        int i=0;
//        int y=i++;
//        System.out.println(i+ " " +y);
//
//        String x=null;
//        System.out.println("f".equals(x));
//        List<Object> list=null;
//        if(Objects.isNull(x)){
//            list = Collections.emptyList();
//        }
//        System.out.println(list);
//    }


    public static void main(String[] args) throws Exception {
        System.out.println(encript1("admin@123"));
    }

    public static String encript1(String passwrd) throws Exception {
        String name = "name";
        String passwd = passwrd;
        String salts = "07,15,44,83,76";

        String salttmp[] = salts.split(",");
        byte salt[] = new byte[salttmp.length];

        for (int i = 0; i < salt.length; i++) {
            salt[i] = Byte.parseByte(salttmp[i]);
        }
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(salt);
        m.update(passwd.getBytes("UTF8"));
        byte s[] = m.digest();
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00)
                    .substring(6);
        }
        return result;
    }

//    public static void main(String[] args) {
//            String s= "dddd";
//            if(s==("dddd")){
//                System.out.println("dddddddddddddddd");
//            }
//
//    }



}
