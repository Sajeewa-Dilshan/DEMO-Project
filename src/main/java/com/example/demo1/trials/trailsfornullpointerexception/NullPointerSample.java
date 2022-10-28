package com.example.demo1.trials.trailsfornullpointerexception;

import com.example.demo1.Sample;
import com.example.demo1.model.nullpointerexceptionmodels.Attribute;
import com.example.demo1.model.nullpointerexceptionmodels.GsmAccount;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class NullPointerSample {
    public static void main(String[] args) {
        System.out.println(getAttribute());
        SampleClass sampleClass=null;
        sampleClass.setValue("ff");

    }

    static String getAttribute(){

        List<Attribute>  attributeList= Arrays.asList(new Attribute("customerGrading","kk"),new Attribute("SDK","sdk"));
//        GsmAccount gsmAccount=new GsmAccount("Lal","30",attributeList);
        GsmAccount gsmAccount=new GsmAccount("Lal","30",attributeList);
        System.out.println(gsmAccount);
        Optional<Attribute> customerGrading = gsmAccount.getAttributeList().stream().filter(attr -> StringUtils.isNotEmpty(attr.getName())&& attr.getName().equals("customerGrading")).findFirst();
//        return customerGrading.map(Attribute::getValue).orElse("l");
        String s="gg";
        Boolean ggg = StringUtils.isNotEmpty(s) ? s.equals("gg") : Boolean.TRUE;
        return ggg.toString();



    }
}

@Data
class SampleClass{

    private String value;

}