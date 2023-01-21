package com.example.demo1.trials.jackson.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtendableBean {

    public String name;
    private Map<String, String> properties;

    @JsonAnyGetter
    public Map<String,String> getProperties(){
        return properties;
    }
}
