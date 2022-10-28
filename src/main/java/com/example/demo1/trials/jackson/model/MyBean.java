package com.example.demo1.trials.jackson.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder(value = { "id", "name" },alphabetic = true)
public class MyBean {
    public int id;
    private String name;

    @JsonGetter("sampleName")
    public String getTheName() {
        return name;
    }
}