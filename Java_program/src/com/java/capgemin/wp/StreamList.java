package com.java.capgemin.wp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {

        /*Integer a[]={23,45,2,4,1,67,3,2,1,3,56,45,34,231,2700};
        Integer secondlast=
        Stream.of(a).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondlast);

        Integer accendingorder=
                Stream.of(a).sorted().distinct().skip(1).findFirst().get();
        System.out.println(accendingorder);

        int sum=
        Stream.of(a).mapToInt(x->x.intValue()).sum();
        System.out.println(sum);*/
        /*Stream.of(a).forEach(x->{
            if(x%2==0){

                System.out.println("Entered Number is Even"+x);
            }else {
                System.out.println("Entered Number is odd"+x);
            }

        });*/


        /*Map<Integer, Long> map=
                Stream.of(a).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);

        String s1 = "Snehal_Shweta_Snehal_Sakshi_Snehal_Shweta_Pratiksha_Snehal";

        String str[]=s1.split("_");
        Map<String,Long> map1=
        Stream.of(str).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(map1);
        List<Map.Entry<String, Long>> map2=
        map1.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList());
        System.out.println(map2);*/

        /*List<Integer> list=List.of(1,45,56,45,88);
        int sum1=addlist(list);
        System.out.println(sum1);*/

        List<Integer> list1 = List.of(3, 5, 6, 3, 6, 23, 87, 27, 46, 54, 98, 43);

        list1.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(2).findFirst().get();


        //{3,5,6,3,6,23,87,27,46,54,98,43}
        int sum = list1.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("sum" + sum);
        double d = sum / list1.size();

        System.out.println("aveeee" + d);
        Map<Integer, Long> map =
                list1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        int max = list1.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(map);
        System.out.println(max);
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Ajay", 35);
        Employee e2 = new Employee("Vijay", 5);
        Employee e3 = new Employee("Zack", 30);
        Employee e4 = new Employee("David", 51);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        List<Employee> listByname = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        List<Employee> listSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(listByname);
        System.out.println(listSalary);
        // Sort employee byname and salary using java 8 stream API
        //  Sort Employee based on gender and age is above 30 using Java 8 stream API
     /*   int spsum=list1.stream().mapToInt(x->x).sum();
        List<Integer> sp=list1.stream().distinct().collect(Collectors.toList());
        Set<Integer> sp1= list1.stream().filter(c->c.intValue()>34).collect(Collectors.toSet());
*/
        // System.out.println(sp1);


        //Integer a[]={23,45,2,4,1,67,3,2,1,3,56,45,34,231,2700};

      /*  List<Integer> list = Arrays.asList(23, 45, 2, 23, 66, 66, 1233, 21, 341, 21);
        List<String> ffff = startwith1Number(list);
        System.out.println(ffff);
        findDuplicateNumber(list);*/
        String s="AAAZKUYYTTRBBCCCDDD";
        countReverseorder(s);
    }

    public static int addlist(List<Integer> list) {
        return list.stream().reduce(0, StreamList::sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    public static List<Integer> findEvenNumber(List<Integer> list) {
        List<Integer> evennumber = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        return evennumber;
    }

    public static List<String> startwith1Number(List<Integer> list) {
        List<String> evennumber = list.stream().map(x -> x + "").filter(c -> (c.charAt(0) + "").equals("1")).collect(Collectors.toList());
        List<Integer> evennumberInteger = evennumber.stream()
                .map(Integer::parseInt).collect(Collectors.toList());

        return evennumber;
    }

    public static void findDuplicateNumber(List<Integer> list) {
        List<Map.Entry<Integer, Long>> countnu = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().
                stream().filter(f -> f.getValue() > 1).collect(Collectors.toList());
        countnu.stream().forEach(n -> System.out.println(n.getKey() + ":" + n.getValue()));
    }

    public static void firstElement(List<Integer> list) {
        int first = list.stream().findFirst().get();
        System.out.println(first);
    }

    public static void countElement(List<Integer> list) {
        long count = list.stream().count();
        System.out.println(count);
    }

    public static void maxElement(List<Integer> list) {
        Integer maxElement = list.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(maxElement);
    }

    public static void nonRepeated(String str) {
        Map.Entry<Character, Long> nonrepited = str.chars().mapToObj(c -> (char) (c)).collect(Collectors.groupingBy(t -> t, LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().findFirst().get();
        System.out.println(nonrepited);
    }

    public static void repeatedFirstCharactor(String str) {
        Map.Entry<Character, Long> repeated = str.chars().mapToObj(c -> (char) (c)).collect(Collectors.groupingBy(t -> t, LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().findFirst().get();
        System.out.println(repeated);
    }

    public static void sortListInteger(List<Integer> integers) {
        List<Integer> integerList = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);
    }
    public static void sortListIntegerDes(List<Integer> integers) {
        List<Integer> integerList = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerList);
    }
    public static void concatStream(List<String> str1,List<String> str2) {
        Stream.concat(str1.stream(),str2.stream()).forEach(s->System.out.println(s));
    }
    public static void lengthgreater5(List<String> str1) {
        str1.stream().filter(x->x.length()>5).collect(Collectors.toList());
    }
    public static void stringJoinger(List<String> str1) {
        String string=str1.stream().collect(Collectors.joining(","));
        System.out.println(string);
    }
    public static void thread() {
        Runnable r=()->{
            Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        };
        Thread t=new Thread(r);
        t.start();
    }

    public static void sumNumber(List<Integer> integers) {
         int sum=integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
    public static void avrageNumber(List<Integer> integers) {
        double sumdouble=integers.stream().mapToDouble(Integer::doubleValue).sum();
        int sum=integers.stream().mapToInt(Integer::intValue).sum();
        sum=sum/integers.size();
        double sum1=integers.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(sum);
    }

    public static void countReverseorder(String s) {
        Map<Character, Long> map2 = s.chars().mapToObj(c -> (char) (c)).collect(Collectors.groupingBy(t -> t, Collectors.counting())).entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue));
        Map<Character, Long> map1 = s.chars().mapToObj(c -> (char) (c)).collect(Collectors.groupingBy(t -> t, Collectors.counting())).entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("map by values" + map1);
        System.out.println("map by key" + map2);
    }
}
