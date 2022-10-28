package com.example.demo1;

import com.example.demo1.model.GsmFulfilmentOrderSubmitEventDto;
import com.example.demo1.testentity.Attribute;
import com.example.demo1.trials.DateTimeUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.DateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {
        String s="http://localhost:8088/subscriptions/dtv-subscriptions/%s/packages/%s/services/%s?bridgeEndpoint=true";

        s=String.format(s,"first","second","third");
        System.out.println(s);

        System.out.println(new java.util.Date());

        System.out.println(DateTimeUtils.format(new java.util.Date()));
        DateTime tenMinutesLater = DateTime.now().plusMinutes( 1);
        java.util.Date date = tenMinutesLater.toDate();
        System.out.println(DateTimeUtils.format(date));
//        String.valueOf(null);


        LocalDateTime date2 = LocalDateTime.parse("2017-01-03T10:15:30");
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date2.until(date1, ChronoUnit.HOURS));

        System.out.println(Arrays.asList("ff","ff","gggg").contains("gggg"));

        System.out.println("UMSffgd".substring(0,3).equals("UMS"));
        System.out.println("PRBTfff".startsWith("PRBT"));

        System.out.println("dfgg");
        System.out.println(Arrays.asList(new Attribute("akdf","SDf"),new Attribute("adfd","SDf"),new Attribute("addf","SDf")).stream().anyMatch(a->a.getName().equals("adf")
                && Objects.nonNull(a.getValue())));
        Optional<Attribute> first = Arrays.asList(new Attribute("adf", "SDgggggggf"), new Attribute("adfd", "SDf"), new Attribute("addf", "SDf"))
                .stream().filter(a -> a.getName().equals("adf")).findFirst();
        System.out.println(first.get().getValue());


        ObjectMapper mapper=new ObjectMapper();
        GsmFulfilmentOrderSubmitEventDto gsmFulfilmentOrderSubmitEventDto=new GsmFulfilmentOrderSubmitEventDto();
        gsmFulfilmentOrderSubmitEventDto.setFulfilmentOrderId("61fa7a2e0936dfb4d581be6a");
        gsmFulfilmentOrderSubmitEventDto.setEvent("GSM_");
    }
}
