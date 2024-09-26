package com.java.capgemin.pr;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEmployee {
    public static void main(String[] args) {
        Address a1=new Address(1,"raj","109","IN",23123);
        Address a2=new Address(2,"kol","203","IN",38983);
        List<Address> addressList=new ArrayList<>();
        addressList.add(a1);
        addressList.add(a2);
        Employee e1=new Employee(1,"bhup",12,3000.0,addressList);
        Employee e2=new Employee(2,"ashok",23,4000.0,addressList);
        Employee e3=new Employee(3,"neha",12,4000.0,addressList);
        Employee e4=new Employee(4,"bhup",34,5000.0,addressList);
        Employee e5=new Employee(5,"kapil",34,8000.0,addressList);
        Employee e6=new Employee(6,"bhup",23,9000.0,addressList);
        Employee e7=new Employee(7,"virat",22,8000.0,addressList);
        List<Employee> list=new ArrayList<>();
        list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);list.add(e6);
        list.add(e7);
        List<Employee> startA=
         list.stream().filter(c->c.getName().startsWith("a")).collect(Collectors.toList());
        System.out.println(" cxvdzcdsfds  "+startA);


        //list.stream().filter(x->x.getSalary()>4000).collect(Collectors.toList());
        Employee fff=
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).filter(x->x.getAge()>30).findFirst().get();
        System.out.println("sortByName");
        System.out.println(fff);


        String sentList="the global payment has done great things";
        Stream<Character> charOccur=sentList.chars().mapToObj(c->(char)c);//.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        charOccur.collect(Collectors.groupingBy(z->z,Collectors.counting()));








       // list.stream().forEach(x->{System.out.println(x);});

        /*Map<Double, List<Employee>> multipleFieldsMap = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()));
        Set<Map.Entry<Double,List<Employee>>> kktkk=
        multipleFieldsMap.entrySet().stream().filter(x->x.getKey()>4000).collect(Collectors.toSet());
        System.out.println(kktkk);

        list.stream().filter(e -> e.getSalary() > 300).collect(Collectors.toList()).
                forEach(System.out::println);

        *//*list.stream().flatMap(x->x.getAddressList().stream()).forEach(address -> {System.out.println(address);});

        String data="asa;scs;2543409942";
                String as[]=data.split(";");
                System.out.println(as.length);*//*
        List<String> list1=Arrays.asList("alok","bhup","kamal","tata","ja");
        Map<Integer,String> map=
        list1.stream().collect(Collectors.toMap(String::length,String::valueOf,(o1,o2)->o2));
        System.out.println(map);

*/

    }
}
