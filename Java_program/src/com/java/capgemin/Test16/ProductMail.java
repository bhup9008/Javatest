package com.java.capgemin.Test16;

import java.util.*;
import java.util.stream.Collectors;

public class ProductMail {
    public static void main(String[] args) {
        String sn="sdfds dfsf";
        String speee[]=sn.split(" ");
        System.out.println(speee.length);

        Product p1=new Product(1,"shirt");
        Product p2=new Product(2,"paint");
        Product p3=new Product(3,"cream");
        Product p4=new Product(4,"shoose");


        List<Product> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        List<Product> sortListdata=
        list.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
        System.out.println(sortListdata);

        String s= "Aapgemini Training";
        List<Character> listca=
        s.toLowerCase().chars().mapToObj(c->(char)c).
                filter(x->

                        x.equals('a')||x.equals('e')||x.equals('i')||x.equals('o')||x.equals('u')).collect(Collectors.toList());

        Map<Character,Long> map=
        listca.stream().collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println(map);

        StringJoiner sb=new StringJoiner(",");

    }
}
