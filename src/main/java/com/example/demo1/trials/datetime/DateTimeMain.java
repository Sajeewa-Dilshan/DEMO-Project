package com.example.demo1.trials.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMain {
    private static final String ZONED_DATE_TIME_FORMATTER = "yyyy-MM-dd hh:mm:ss a Z";

    public static void main(String[] args) {

//        try {
//            LocalDateTime ldt="1994 10 24 08 56 22";
//            ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
//             DateTimeFormatter.ofPattern(ZONED_DATE_TIME_FORMATTER).format(zdt);
//        }catch (Exception e){
//            LOGGER.error("Cannot format Date time error{}",e.getMessage());
//        }

        LocalDateTime dateTime1 = LocalDateTime.parse("1995-10-14T00:00");
        String format = DateTimeFormatter.ofPattern("dd-MMM-yy").format(dateTime1);
        System.out.println(format);

    }
}
