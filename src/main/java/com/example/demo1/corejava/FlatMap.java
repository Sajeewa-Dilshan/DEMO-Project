package com.example.demo1.corejava;

import com.example.demo1.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        List<String> fav= new ArrayList<>();
        fav.add("apple");
        fav.add("cake");
        
        Customer customer1=new Customer("001","0711234567",fav);
        Customer customer2=new Customer("002","0711234568",fav);
        Customer customer3=new Customer("003","0711234569",fav);
        Customer customer4=new Customer("004","0711234560",fav);

        List<Customer> collect = Stream.of(customer1, customer2, customer3, customer4).collect(Collectors.toList());
        List<String> names = collect.stream().map(customer -> customer.getId()).collect(Collectors.toList());
        System.out.println(names);

        List<List<String>> faveListOfList = collect.stream().map(
                customer -> customer.getFavorites()).collect(Collectors.toList());

        List<String> collect1 = collect.stream().flatMap(customer -> customer.getFavorites().stream()).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
