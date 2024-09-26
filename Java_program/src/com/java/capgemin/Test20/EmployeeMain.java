package com.java.capgemin.Test20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee(102,"hello",456.0);
        Employee e2=new Employee(300,"kuldeep",900.0);
        Employee e3=new Employee(102,"manoj",600.0);
        Employee e4=new Employee(399,"satish",4666.0);
        Employee e5=new Employee(102,"mayank",3000.0);
        Employee e6=new Employee(40,"piyush",7000.0);
        Employee e7=new Employee(899,"jp",400.0);
        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        //EmplyeeByNameCompa emplyeeByNameCompa=new EmplyeeByNameCompa();
        //Collections.sort(list);
        //Collections.sort(emplyeeByNameCompa);
        Collections.sort(list,new SortByID());
        list.stream().forEach(x->{System.out.println(x.getId()+":"+x.getName()+":"+x.getSalary());});
    }
}
