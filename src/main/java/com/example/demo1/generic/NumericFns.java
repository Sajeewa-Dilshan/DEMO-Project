package com.example.demo1.generic;

public class NumericFns<T extends Number> {
    T ob;
    NumericFns(T ob){
        this.ob=ob;
    }

    double square(){
        return ob.intValue()*ob.intValue();
    }

}
