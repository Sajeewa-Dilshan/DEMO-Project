package com.example.demo1.trials.lambda;

public class HelloWorldGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}
