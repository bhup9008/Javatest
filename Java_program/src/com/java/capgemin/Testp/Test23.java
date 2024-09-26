package com.java.capgemin.Testp;

import java.util.*;
import java.util.stream.Collectors;

public class Test23 {
    public static void main(String[] args) {


        String str="resiaterjavahumanpayd";

                str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(x->x.getValue()<=1);

        List<Map.Entry<Character,Long>> list=
        str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());

        Map<Character,Long> map=
        list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1,e2)->e1));
        System.out.println(map);


        int x=5;

        for (int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

       /* for(int i=5;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }*/








}}
