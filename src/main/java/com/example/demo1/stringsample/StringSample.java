package com.example.demo1.stringsample;

import org.apache.commons.lang3.StringUtils;

public class StringSample {
    public static void main(String[] args) {
        String s=" ";
        boolean notEmpty = StringUtils.isNotEmpty(s);
        System.out.println(notEmpty);

    }
}
