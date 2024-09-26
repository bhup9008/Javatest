package com.java.capgemin;

import com.java.capgemin.pr.function.A;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("test data");


        String stro="1234Pxyx";


        //stro.chars().map(Character::isDigit).sum()
       /* String s = "qwerty1qwerty2";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                System.out.print(s.charAt(i)+"  ");
        }*/


        List<Integer> list = Arrays.asList(12,4,56,6,34,22,34,6);
        Integer dghdgj=
        list.stream().distinct().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
        System.out.println(dghdgj);
        //list.stream().mapToDouble()

       // String str="gghj8";
        //str.chars().filter(Character::isDigit).collect(Collectors.toList());
       // System.out.println("hello "+c);
        String str="sdfvsdf68fsdfsf8999fsdf09";
        String numberOnly= str.replaceAll("[^0-9]", "");

        System.out.println("hello "+numberOnly);
        Integer sumOfDigits = Stream.of(numberOnly.split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("hellolllmkgugugb "+sumOfDigits);
        String number[]=numberOnly.split("");
        Arrays.stream(number).collect(Collectors.summingInt(Integer::parseInt));

        List<String> list1=Arrays.asList("shuhangi" ,"piyush","manish");
        //Predicate<String> s=
                Predicate<String> lesserthan = i -> (i.equals("shuhangi"));
        //list1.stream().map(x->x)
        list1.stream().filter(lesserthan).collect(Collectors.toList()).forEach(y->System.out.println(y));
        //list1.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(x->System.out.println(x));


        int x=12341;
        String s[]=String.valueOf(x).split("");
        List<String> list2= Arrays.asList(s);
        list2.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()))
                .entrySet().stream().filter(x1->x1.getValue()>1).forEach(u->{System.out.println(u.getKey()+":"+u.getValue());
        });



    }

  //  private Integer getInteger()






}
