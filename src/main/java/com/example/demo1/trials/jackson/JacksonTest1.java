package com.example.demo1.trials.jackson;

import com.example.demo1.trials.jackson.model.ExtendableBean;
import com.example.demo1.trials.jackson.model.MyBean;
import com.example.demo1.trials.jackson.model.RawBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class JacksonTest1 {

    public static void main(String[] args) throws JsonProcessingException {
       //@JsonAnyGetter
        Map<String,String> map=new HashMap<>();
        map.put("key1","val1");
        map.put("key2","val2");
        ExtendableBean extendableBean=new ExtendableBean("My bean",map);
        String s = new ObjectMapper().writeValueAsString(extendableBean);

        //@JsonGetter @JsonPropertyOrder
        MyBean myBean= new MyBean(1,"My bean");
        String s1 = new ObjectMapper().writeValueAsString(myBean);

        //@JsonRawValue
        RawBean rawBean= new RawBean("My bean","{\"attr\":false}");
        System.out.println(rawBean);
    }
}
