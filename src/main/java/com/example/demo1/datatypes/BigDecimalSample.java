package com.example.demo1.datatypes;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalSample {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("4930592405923095023950238502395.3259023950235902");
        System.out.println(b);
        String string = b.toPlainString();
        System.out.println(b.toPlainString());

        double number = 12.000047823458;

//        String pattern = "##.############";
//        DecimalFormat decimalFormat = new DecimalFormat(pattern);
//        String format = decimalFormat.format(number);
//        System.out.println(decimalFormat.format(number));
//
    }
}
