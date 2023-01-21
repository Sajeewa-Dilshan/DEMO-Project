package com.example.demo1.controller.webclient;

import com.example.demo1.controller.webclient.Model.CustomerResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webclient-sample")
public class SampleController {


    @PostMapping("/post-sample")
    public CustomerResponse postCustomer(@RequestHeader("traceId") String traceId,
                                        @RequestBody CustomerResponse customerResponse){

        System.out.println(traceId+" "+customerResponse);
        return new CustomerResponse("001","accepted");
    }

}