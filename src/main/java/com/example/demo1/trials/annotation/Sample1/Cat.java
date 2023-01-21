package com.example.demo1.trials.annotation.Sample1;
@VeryImportant
public class Cat {
    @ImportantString
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @RunImmediately(times = 3)
    public void meow(){
        System.out.println("Meow");
    }

    public void eat(){
        System.out.println("Munch");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
