package com.example.demo1.datetimetests;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class DateTimeTests {
    public static void main(String[] args) {
        LocalDateTime l=LocalDateTime.now().minusDays(2).plusMinutes(1);
        System.out.println(LocalDateTime.now().minusDays(5).until(l, ChronoUnit.DAYS));
        BigDecimal creditLimit = BigDecimal.valueOf(10000.45345345345*9);
        System.out.println(creditLimit.toString());

        String format = DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss A Z").format(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(format);




        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a z");

        DateTimeFormatter formatterWithoutTimeZone
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime ldt = LocalDateTime
                .parse("2019-03-27 10:15:30", formatterWithoutTimeZone);


        LocalDateTime ldt2 = LocalDateTime
                .parse("2019-03-27T10:15:30");

//        LocalDateTime ldt3 = LocalDateTime
//                .parse("2019-03-27 10:15:30", formatter);

        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt2, ZoneId.systemDefault());
//        ZonedDateTime zdt3 = ZonedDateTime.of(ldt3, ZoneId.systemDefault());

        System.out.println(zdt+" "+zdt2);

        String format1 = DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss a Z").format(zdt2);
        String format2 = zdt2.format(formatter);
        System.out.println(format1);
        System.out.println(format2);
        TimeZone aDefault = TimeZone.getDefault();
        TimeZone tz = TimeZone.getDefault();
    }
}
