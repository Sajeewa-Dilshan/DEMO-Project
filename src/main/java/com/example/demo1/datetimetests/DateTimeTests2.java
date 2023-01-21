package com.example.demo1.datetimetests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTests2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime1=LocalDateTime.now();
        LocalDateTime localDateTime2=LocalDateTime.now().minusDays(10);

        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format1 = dateTimeFormatter.format(localDateTime1);
        String format2 = dateTimeFormatter.format(localDateTime2);
        System.out.println(LocalDate.parse(format1).isAfter(LocalDate.parse(format2)));

    }
}
