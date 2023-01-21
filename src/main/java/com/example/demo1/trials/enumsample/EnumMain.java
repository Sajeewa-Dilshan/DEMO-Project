package com.example.demo1.trials.enumsample;

import java.util.stream.Stream;

public class EnumMain {

    public static void main(String[] args) {
        System.out.println(checkEnum(SampleEnum.EX1));
    }

    private static Boolean checkEnum(SampleEnum sampleEnum){
        return sampleEnum.equals(SampleEnum.EX1);
    }
}
