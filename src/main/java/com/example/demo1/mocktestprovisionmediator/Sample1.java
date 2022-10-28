package com.example.demo1.mocktestprovisionmediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sample1 {

    public static void main(String[] args) {
        List<Attribute> attributes=new ArrayList<>();
        System.out.println(Objects.nonNull(attributes));
        System.out.println(Objects.nonNull(attributes) && attributes.size()>0);
        Boolean b=null;
    }
}


class Attribute{
    String name;
    String value;
}
