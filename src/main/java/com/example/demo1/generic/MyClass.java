package com.example.demo1.generic;

public class MyClass<T,K> {

    T ob1;
    K ob2;
    MyClass(T ob1, K ob2){
        this.ob1=ob1;
        this.ob2=ob2;
    }

    void showType(){
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    T getValue(){
        return ob1;
    }
}
