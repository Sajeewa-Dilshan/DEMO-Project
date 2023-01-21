package com.example.demo1.trials.absractclass;

public class AbstractMain {

    public static void main(String[] args) {

    }

}

abstract class Shape{
    Shape(){
        System.out.println("Shape is Constructed");
    }
    abstract void draw();
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Draw a circle");
    }
}

class Polygon extends Shape{

    @Override
    void draw() {
        System.out.println("Draw a polygon");
    }
}
