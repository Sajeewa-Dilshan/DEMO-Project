package com.example.demo1.trials.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface Vehicle {

    void goForward();

    default void corner(){
        System.out.println("turn right");
    }

     static void switchOnLights(){
        System.out.println("turn on head light");
    }
}
