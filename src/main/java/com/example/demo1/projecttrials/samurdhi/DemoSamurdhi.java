package com.example.demo1.projecttrials.samurdhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DemoSamurdhi {

    public static void main(String[] args) throws ParseException {
        String sDate1 = "30/04/2022";
        String sDate2 = "30/08/2022";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
        System.out.println(monthsBetween(date2, date1));

        String localDateTime1 = "2022-04-30 00:00";
        String localDateTime2 = "2022-08-30 05:32";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


        LocalDateTime dateTime1 = LocalDateTime.parse(localDateTime1, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(localDateTime2, formatter);
        int i = dateTime1.compareTo(dateTime2);
        System.out.println("Compare "+i);

        System.out.println(dateTime1.withHour(00).withMinute(00).withSecond(00));
        System.out.println(dateTime2.withHour(00).withMinute(00).withSecond(00));

        boolean after = dateTime1.withHour(00).withMinute(00).withSecond(00).isAfter(dateTime2.withHour(00).withMinute(00).withSecond(00));
        System.out.println("after "+after);

        System.out.println(getStartDate(dateTime2,4));
        System.out.println(i);
        System.out.println("months diff " + monthsBetween(dateTime2, dateTime1));
        System.out.println("months diff modified" + monthsBetweenModified(dateTime2, dateTime1));

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().getYear());

//        String localDateTime3 = "2022-07-21 00:00";
//        LocalDateTime dateTime3 = LocalDateTime.parse(localDateTime3, formatter);
//        System.out.println(dateTime3.minusMonths(6));
//        System.out.println(dateTime3.minusMonths(6));
//
//        String sDate3 = "30/06/2022";
//        Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//        System.out.println(getStartDate(date4,6));
//
//
//        String localDateTime5 = "2022-04-30 14:31";
//        LocalDateTime dateTime5 = LocalDateTime.parse(localDateTime5, formatter);
//        System.out.println( dateTime5.minusMonths(4-1).withDayOfMonth(1).withHour(00).withMinute(00).withSecond(00));
//
//        System.out.println(getStringLocalDateTime(dateTime3));


    }


    public static double monthsBetween(Date startdate, Date endDate) {
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.setTime(startdate);
        date2.setTime(endDate);
        double monthsBetween = 0;
        //difference in month for years
        monthsBetween = (date1.get(Calendar.YEAR) - date2.get(Calendar.YEAR)) * 12;
        //difference in month for months
        monthsBetween += date1.get(Calendar.MONTH) - date2.get(Calendar.MONTH);
        //difference in month for days
        if (date1.get(Calendar.DAY_OF_MONTH) != date1.getActualMaximum(Calendar.DAY_OF_MONTH)
                && date1.get(Calendar.DAY_OF_MONTH) != date1.getActualMaximum(Calendar.DAY_OF_MONTH)) {
            monthsBetween += ((date1.get(Calendar.DAY_OF_MONTH) - date2.get(Calendar.DAY_OF_MONTH)) / 31d);
        }
        return monthsBetween;
    }

    public static double monthsBetween(LocalDateTime payDate, LocalDateTime previousPayDate) {
        Period diff = Period.between(
                LocalDate.parse(previousPayDate.toLocalDate().toString()).withDayOfMonth(1),
                LocalDate.parse(payDate.toLocalDate().toString()).withDayOfMonth(1));
        return diff.toTotalMonths();
//        return previousPayDate.until(payDate, ChronoUnit.MONTHS);
    }

    public static double monthsBetweenModified(LocalDateTime payDate, LocalDateTime previousPayDate) {
        Period diff = Period.between(
                LocalDate.parse(previousPayDate.toLocalDate().toString()),
                LocalDate.parse(payDate.toLocalDate().toString()));
        return diff.toTotalMonths();
//
    }

    private static Date getStartDate(Date theDate, int months) {
        Calendar c = Calendar.getInstance();
        c.setTime(theDate);
        c.add(Calendar.MONTH, -months);
        c.add(Calendar.MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().getActualMinimum(Calendar.DAY_OF_MONTH));
        //c.add(Calendar.DATE, 1);
        return c.getTime();
        //return new DateTime(theDate).minusMonths(months).toDate();
    }

    private static String getStringLocalDateTime(LocalDateTime ldt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = ldt.format(formatter);
        return format;
    }

    public static LocalDateTime getStartDate(LocalDateTime theDate, int months) {

        return theDate.minusMonths(months-1).withDayOfMonth(1).withHour(00).withMinute(00).withSecond(00);
    }
}
