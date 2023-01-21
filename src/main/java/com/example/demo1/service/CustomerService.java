package com.example.demo1.service;

import com.example.demo1.model.Customer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerService {

    public static List<Customer> customerList;

    @PostConstruct
    public void set(){

    }
}
