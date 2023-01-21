package com.example.demo1.corejava;

public class anonymousInnerClasses {

    public static void main(String[] args) {
        Animal myAnimal= new Animal();
        myAnimal.makeNoise();

        Animal bigfoot =new Animal(){
            public void makeNoise(){
                System.out.println("Grawlneenlnenlenggeheeee");
            }
        };
        bigfoot.makeNoise();
    }
}
