package com.example.demo1.trials.numbers;

import com.example.demo1.trials.numbers.model.Account;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

public class BigDecimalTrials {


    public static void main(String[] args) throws JsonProcessingException {
        Double d = 25000.0;
        BigDecimal bigDecimal = BigDecimal.valueOf(d * 10000);
        double v = bigDecimal.doubleValue();
        System.out.println(v);

        Account build = Account.builder().creditLimit(BigDecimal.valueOf(2500.0 * 10000)).build();
        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writeValueAsString(build);
        System.out.println(string);

        Account account = mapper.readValue(string, Account.class);
        System.out.println(account);
    }
}
