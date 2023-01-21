package com.example.demo1.generic;

public class NumericFnsWildCard<T extends Number> {
    T num;
    NumericFnsWildCard(T num){
        this.num=num;
    }

    boolean absEqual(NumericFnsWildCard<?> ob){
        if(Math.abs(ob.num.doubleValue())==Math.abs(num.doubleValue())){
            return true;
        }else{
            return false;
        }
    }
}
