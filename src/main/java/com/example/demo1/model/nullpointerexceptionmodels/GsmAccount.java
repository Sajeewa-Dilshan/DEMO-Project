package com.example.demo1.model.nullpointerexceptionmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GsmAccount {
    String name;
    String age;
    List<Attribute> attributeList;

}
