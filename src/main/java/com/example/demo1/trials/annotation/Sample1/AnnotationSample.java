package com.example.demo1.trials.annotation.Sample1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationSample {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat= new Cat("Stella");
        boolean annotationPresent = myCat.getClass().isAnnotationPresent(VeryImportant.class);
        System.out.println(annotationPresent);

        for(Method method: myCat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation =method.getAnnotation(RunImmediately.class);
                for(int i=0; i<annotation.times();i++){
                    method.invoke(myCat);
                }
            }
        }

       for(Field field: myCat.getClass().getDeclaredFields()){
           if(field.isAnnotationPresent(ImportantString.class)){
               Object o = field.get(myCat);

               if(o instanceof String){
                   System.out.println(o);
               }

           }
       }
    }
}
