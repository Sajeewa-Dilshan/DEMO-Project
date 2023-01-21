package com.example.demo1.attribute;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class SampleAttribute {

    public static void main(String[] args) {
        AttrCollection attrCollection=new AttrCollection();
        List<SampleAttr> sampleAttrList=new ArrayList<>();
        SampleAttr sampleAttr=new SampleAttr();
        SampleAttr sampleAttr1=new SampleAttr();
        sampleAttr.setName("name");
        sampleAttr.setValue("value");

        sampleAttr1.setName("name1");
        sampleAttr1.setValue("value1");

        sampleAttrList.add(sampleAttr);
        sampleAttrList.add(sampleAttr1);
        attrCollection.setSampleAttrList(sampleAttrList);
        String s="fff";
        attrCollection.getSampleAttrList().stream()
                .forEach(a->{
                    if(a.getName().equals("name")) {
                        a.setValue(s);
                    }
                });

        System.out.println(attrCollection);
    }
}
@Data
class AttrCollection{

    List<SampleAttr> sampleAttrList;

}

@Data
class SampleAttr{
    private String name;
    private String value;

}