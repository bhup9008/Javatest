package com.java.capgemin.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"bhupendrs","kumar",4000.0);
        Customer c2=new Customer(567,"kamal","sbdbsu",8000.0);
        Customer c3=new Customer(67,"Anil","saii",8900.0);
        Customer c4=new Customer(13,"rahul","lapal",9000.0);
        List<Customer> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        //Collections.sort(list);
        Collections.sort(list,new CustomerByNameSort());
        System.out.println(list);
    }
}
