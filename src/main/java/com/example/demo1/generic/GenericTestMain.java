package com.example.demo1.generic;

public class GenericTestMain {
    public static void main(String[] args) {

        MyClass<Integer,String> obj1=new MyClass<>(10,"Generic");
        MyClass<Double,Integer> obj2=new MyClass<>(20.0,2);

        obj1.showType();
        System.out.println(obj1.getValue());
        obj2.showType();
        System.out.println(obj2.getValue());

        NumericFns<Double> numericFns=new NumericFns<>(4.0);
        System.out.println(numericFns.square());

        NumericFnsWildCard<Integer> numericFnsWildCard1=new NumericFnsWildCard<>(-16);
        NumericFnsWildCard<Double> numericFnsWildCard2=new NumericFnsWildCard<>(16.1);

        System.out.println(numericFnsWildCard1.absEqual(numericFnsWildCard2));

    }


}
