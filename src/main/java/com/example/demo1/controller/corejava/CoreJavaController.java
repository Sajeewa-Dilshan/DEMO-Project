package com.example.demo1.controller.corejava;

import com.example.demo1.trials.interfaces.Car;
import com.example.demo1.trials.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreJavaController {

    @Autowired
    Vehicle vehicle;

    @Autowired
    Car car;



    @PostMapping("/demo/{id}")
    public ResponseEntity<String> interfaceTest(@PathVariable("id") String id){
        vehicle.corner();
        car.goForward();
        Vehicle.switchOnLights();
        return new ResponseEntity<>("String",HttpStatus.OK);
    }
}
