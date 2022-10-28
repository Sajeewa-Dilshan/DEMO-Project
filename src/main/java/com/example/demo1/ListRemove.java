package com.example.demo1;

import com.example.demo1.model.nullpointerexceptionmodels.Attribute;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListRemove {

    public static void main(String[] args) throws ParseException {
        List<String> absentAttributes= new ArrayList<>();
        absentAttributes.add("successFlag");
        absentAttributes.add("successFlags");
        int index = absentAttributes.indexOf("successFlag");
        absentAttributes.remove(index);

        List<String> list = Arrays.asList("one", "two", "three", "Four");
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger i= new AtomicInteger(0);
        List<Attribute.AttributeBuilder> collect = list.stream().map(a -> Attribute.builder().name(String.valueOf(i.getAndIncrement())).value(a.toString())).collect(Collectors.toList());
        Long l=5L;
        System.out.println(Arrays.asList(1L,2L,3L,5L).contains(l));
        Long l2=0L;
        Math.toIntExact(l2);

        List<Attribute> attributes=new ArrayList<>();
        attributes.add(new Attribute("y","l"));
        attributes=null;
        System.out.println(Objects.nonNull(attributes));
//        List<Attribute> y = attributes.stream().filter(attribute -> attribute.getName().equals("y")).collect(Collectors.toList());
//        System.out.println(y);
        if(Objects.nonNull(attributes) && attributes.stream().anyMatch(a->a.getName().equals("y"))){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
