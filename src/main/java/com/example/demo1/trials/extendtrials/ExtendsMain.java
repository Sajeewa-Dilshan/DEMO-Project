package com.example.demo1.trials.extendtrials;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtendsMain {
    public static void main(String[] args) throws JsonProcessingException {
        Nokia nokia=new Nokia("nokia");
        Samsung samsung=new Samsung("sam");
        nokia.setCamera("8");
        nokia.setScreen("6.7");

        Phone phone=nokia;
        ObjectMapper objectMapper= new ObjectMapper();
        String value = objectMapper.writeValueAsString(nokia);
        int i=4;
        Phone phone1 = 4 > 3 ? objectMapper.readValue(value, Nokia.class) : objectMapper.readValue(value, Samsung.class);
        String stringPhone1 = objectMapper.writeValueAsString(phone1);
        System.out.println(stringPhone1);
    }
}
