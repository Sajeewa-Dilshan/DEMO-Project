package com.example.demo1.controller.testapi;

import com.example.demo1.model.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test-api")
public class TestApiController {

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){


        return  customer;
    }
}
