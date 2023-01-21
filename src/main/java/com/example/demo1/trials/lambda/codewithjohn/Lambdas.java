package com.example.demo1.trials.lambda.codewithjohn;

public class Lambdas {

//    public static void main(String[] args) {
//        Cat cat=new Cat();
//        cat.print("s1","s2");
//        printThing(cat);
//        printThing((s1,s2)-> {
//                    System.out.println("44");
//                    cat.print(s1,s2);
//                }
//        );
//
//        printThing((s1,s2)-> System.out.println("44"+s1+s2));
//        Printable printable = (s1,s2) -> System.out.println("variable" +s1+s2);
//        printThing(printable);
//        Cat2 cat2=new Cat2();
//
//        printThing2(cat2);
//        System.out.println(printThing2((s1,s2)->s1+s2));
//
//    }

    static void printThing(Printable thing){
        thing.print("pt","1");
    }

    static String printThing2(Printable2 thing){
        return thing.print("pt","2");
    }

    static String printThing3(Printable3 thing){
        return thing.print("pt","3");
    }

    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.print("e","f");
        printThing((s1,s2)-> System.out.println("44"+s1+s2));

        printThing((s1,s2)-> System.out.println(1000*20 +" "+(s1+" "+s2)));
        System.out.println(printThing3((s1,s2)-> "44"+s1+s2));

        Printable3 printable3=new Printable3() {
            @Override
            public String print(String s1, String s2) {
                System.out.println("pt 3");
                System.out.println("pt 3");
                return 1000+" "+s1+" "+s2;
            }
        };

        System.out.println(printThing3(printable3));




    }
}
