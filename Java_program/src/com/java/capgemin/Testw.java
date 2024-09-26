package com.java.capgemin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testw {
    public static void main(String[] args) {

        Stream<String> sm=Stream.of("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
       String joiner= sm.map(s->s.toUpperCase()).collect(Collectors.joining(","));
       System.out.println(joiner);

        /*Stream<String> sm2=Stream.of("wee","cap");
        Stream.concat(sm,sm2).forEach(s -> System.out.println(s));*/


        String rep="HelloWord";
        Map<Character,Long> map1=
        rep.chars().mapToObj(c1->(char)(c1)).collect(Collectors.groupingBy(f->f,LinkedHashMap::new,Collectors.counting()));
        Map.Entry<Character,Long> alla=map1.entrySet().stream().filter(x->x.getValue()>1L).findFirst().get();
        System.out.println(alla.getKey()+":::"+alla.getValue());

        String hm="Learn12programming34skills";
        String str="sdfvsdf68fsdfsf8999fsdf09";
        String numberOnly= str.replaceAll("[^0-9]", "");
        Integer x=str.chars() // Creating an IntStream of chars (ASCII values)
                .map(Character::getNumericValue) // Converting each ASCII value to its numeric value
                .sum();
        System.out.println("dddds "+x);
        System.out.println(numberOnly);
        String spl[]=hm.split(" ");
        System.out.println(spl.length);
        for (String d:spl){
            System.out.println(d);
        }
        List<Integer> list=Arrays.asList(345,4575,14,21,4675,13,24,45,45);
        List<String> oopp=
        list.stream().map(p->p+"").filter(g->g.startsWith("1")).collect(Collectors.toList());
        System.out.println("jhgJYGubk    bjj  "+oopp);

        list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet()
                 .stream().filter(g->g.getValue()>1).forEach(p->System.out.println(p.getKey()+"-"+ p.getValue())
                );

        int maxnum=
        list.stream().max(Comparator.comparing(Integer::intValue)).get();
        List<Integer> sortlist=
        list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.println("sort lidt "+sortlist);

        System.out.println("max number ="+maxnum);
        List<Integer> listas=Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        long count=listas.stream().count();
        System.out.println(" count "+count);
        int sum =listas.stream().mapToInt(Integer::intValue).sum();
        System.out.println(" sum "+sum);
        double avg =listas.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("avg "+avg);
        double max =listas.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("max "+max);

        List<Integer> listsq=
                listas.stream().distinct().map(f->f*f).collect(Collectors.toList());

        System.out.println("first sq"+listsq);
        Integer in=list.stream().findFirst().get();
        System.out.println("first data"+in);
        Map<Integer,Long> map=
        list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
       // map.entrySet().stream().filter(x->x.getValue()>1).forEach(f->{System.out.println(f.getKey()+":"+f.getValue());});
       // list.stream().filter(x->x%2==0).forEach(y->System.out.println(y));
       // list.stream().map(x->x+"").filter(n->(n.charAt(0)+"").equals("1")).forEach(g->System.out.println(g));



        /*List<Integer > list1 =Arrays.asList(1);
        list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        String[] s=new String[]{"Capgemini","Accenture","TCS","EPAM"};
        List<String > list =Arrays.asList(s);
        list.stream().sorted().forEach(x->System.out.println(x));*/

        List<Integer> list2=new ArrayList<>();
        int n=6;
        boolean f=isPrime(n);
        if(f) {
            list2.add(n);
        }
        //list2.stream().forEach(x->System.out.println(x));

       /* String str = "java";
        String str1="javaV";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        //System.out.println(str1.hashCode());
        str = "program";
        System.out.println(str.hashCode());
        System.out.println(str);
        str=str.concat("language");
        System.out.println(str);

        String c=null;
        String c1="hello";
        System.out.println(c==c1);
       // System.out.println(c.equals(c1));*/
       /* int a[ ] = {1, 2, 4, 6};
        int l=a.length;
        int miss = getMissingNo(a, l);
        System.out.println("The number missing is :"+miss);*/
        /*for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }*/

        //String s="MADAM";
      //  s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s1->s1,Collectors.counting()));

     //  boolean check= revser(s);
     //  System.out.println(check);
        //iseven(34);
        //System.out.println(b);
       // faboric(4);


    }

    public static  boolean revser(String str){

        String rev="";
        boolean flag=false;
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev =rev+ch;
        }
        System.out.println(rev);
        if(str.equals(rev)){
            return true;
        }

        return flag;
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static  int getMissingNo(int a[],int n){
        int i, total;
        total  = (n + 1) * (n + 2) / 2;
        for ( i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

    static void iseven(int n)
    {
        if(n%2==0){
            System.out.println(n +"is even number");
        }else {
            System.out.println(n +"is odd number");
        }
    }
    static void faboric(int n)
    {

        int a=0,b=1,c;
        System.out.print(a+" "+b);//printing 0 and 1
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }



}
