package com.example.demo1.trials.objectcloning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ObjectCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer =new Customer();
        customer.setAge(29);
        customer.setName("John");
        customer.setId("001");

        Customer customerClone= (Customer) customer.clone();
        Customer customer2= customer;

        customer2.setId("002");
        changeCustom(customer2);
        System.out.println(customer==customer2);
        System.out.println(customer2);
    }

    static void changeCustom(Customer customer){
        customer.setId("003");
    }
}


@AllArgsConstructor
@NoArgsConstructor
@Data
class Customer implements Cloneable{

    String id;
    String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    int age;

}