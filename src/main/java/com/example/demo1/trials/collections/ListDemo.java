package com.example.demo1.trials.collections;

import com.example.demo1.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListDemo {
//    public static void main(String[] args) {
//        List<String> strings =new ArrayList<>();
//        strings.add("a");
//        strings.add("c");
//        strings.add("b");
//        System.out.println(strings);
//        strings.add(1,"l");
//        System.out.println(strings);
//        Long subscriberNodeId=78569841L;
//        String substring = subscriberNodeId.toString().substring(subscriberNodeId.toString().length() - 2);
//        System.out.println(substring);
//    }

//    public static void main(String[] args) {
//        List<Integer> integers= Arrays.asList(1,2,3,4,5,6);
//        Stream<Integer> stream = integers.stream();
//
//        integers.forEach(a-> System.out.println(a));
//
//        ArrayList list=new ArrayList();
//        list.add("r");
//        list.add(1);
//        list.add('d');
//
//        List<Customer> accList= new ArrayList<>();
//        System.out.println(accList);
//        if(!accList.isEmpty()){
//            System.out.println("Y");
//        }
//    }

    public static void main(String[] args) {
        boolean check=false;
        ListItem listItem1 =new ListItem(24,"John");
        ListItem listItem2 =new ListItem(32,"Mike");

        List<ListItem> listItems=new ArrayList<>();
        listItems.add(listItem1);
        listItems.add(listItem2);

        listItems.removeIf(a->a.getAge()<25 && check);
        System.out.println(listItems);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class ListItem{
    int age;
    String name;
}