package com.example.demo1.objecttests;

import lombok.Data;

import java.util.Objects;

public class ObjectTest {

    public static void main(String[] args) {
        SampleObject sampleObject= new SampleObject();
        sampleObject.setCount(3);
        ObjectTest objectTest= new ObjectTest();
        objectTest.increaseCount(sampleObject);
        System.out.println(sampleObject.getCount());

    }

    void increaseCount(SampleObject sampleObject){
        sampleObject.setCount(sampleObject.getCount()+1);
    }
}

@Data
class SampleObject{
    private int count;
    private int height;
}
