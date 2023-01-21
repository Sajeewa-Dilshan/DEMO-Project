package com.example.demo1.trials.collections.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        List<Attribute> list=new ArrayList<>();
        list.add(new Attribute("d1","ff"));
        list.add(new Attribute("d2",null));

        list.stream().filter(eav -> eav.getName().equals("d2")).findFirst().map(Attribute::getValue).orElse(null);

    }
}


@AllArgsConstructor
@Data
 class Attribute {
    private String name;
    private String value;

}