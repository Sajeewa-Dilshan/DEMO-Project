package com.example.demo1.projecttrials.samurdhi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoSamrdhi2 {

    public static void main(String[] args) {

        double accBalance=1073.00;
        double v2 = calculateInterest(accBalance);
        System.out.println(v2);
        double v1 = BigDecimal.valueOf(accBalance + v2).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        System.out.println(v1);

    }
    public static double calculateInterest(double accBalance) {

        double intAmount =((accBalance * (3.0 / 100)) / 12) * 6;
        System.out.println(intAmount);

        return new BigDecimal(intAmount).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
}
