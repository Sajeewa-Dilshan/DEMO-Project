package com.example.demo1.controller.resttemplate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

    @GetMapping("/invoke")
    public ResponseEntity<String> invokeApi(){
        RestTemplate restTemplate=new RestTemplate();

        return new ResponseEntity<>("String", HttpStatus.OK);
    }

}
