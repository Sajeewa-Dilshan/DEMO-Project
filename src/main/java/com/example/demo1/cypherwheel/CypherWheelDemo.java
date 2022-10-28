package com.example.demo1.cypherwheel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CypherWheelDemo {
    public static void main(String[] args) {
        List<String> alphabet= Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        int cypherValue=2;

        String cypherCode="cde";
        String[] array = cypherCode.split("");
        String decodedString="";
        for (String cypherChar:array){
            for(String realChar:alphabet){
                if(Objects.equals(cypherChar, realChar)){
                    int i = alphabet.indexOf(realChar);
                    if(i-cypherValue<0){
                        decodedString=decodedString+(alphabet.get(26+(i-cypherValue)));
                    }else {
                        decodedString=decodedString+(alphabet.get(i-cypherValue));
                    }
                }
            }
        }
        System.out.println(decodedString);

    }
}
 class Solution {
    public static void main(String []argh){
        System.out.println(cipherText("ABC",2));
    }
    private static String cipherText(String cipher,int k){
        char[] text = cipher.toCharArray();
        int index = k%26;
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] originalText = new char[cipher.length()];
        for(int i=0;i< text.length ;i++){
            int currentIndex = alphabet.indexOf(text[i]);
            System.out.println(currentIndex);
            originalText[i] =  alphabet.charAt((currentIndex-k)%26);
        }
        return new String(originalText);
    }
}
class Solution2 {
    public static void main(String []argh){
        System.out.println(cipherText("XYZ",2));
    }
    private static String cipherText(String cipher,int k){
        char[] text = cipher.toCharArray();
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] originalText = new char[cipher.length()];
        for(int i=0;i< text.length ;i++){
            int currentIndex = alphabet.indexOf(text[i]);
            originalText[i] =  alphabet.charAt(((currentIndex-k)+26)-1);
        }
        return new String(originalText);
    }
}
class Solution3{
    public static void main(String[] args) {
        final String alphabet = "ABCDE";
        System.out.println(alphabet.charAt(56));
    }
}
