package com.example.demo1.trials.variavles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BigDecimalSample {

    public static void main(String[] args) {
        BigDecimal bigDecimal= new BigDecimal("785.005001");
        System.out.println(bigDecimal.equals(new BigDecimal(785)));
        Long l=null;
        BigDecimal bigDecimal1=get();
        System.out.println(bigDecimal1);
        String toStringValue = getToStringValue(bigDecimal.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(toStringValue);
    }

    static BigDecimal get(){
        return null;
    }

    static String getToStringValue(Object value) {
        return Objects.nonNull(value)? value.toString():null;
    }
}
