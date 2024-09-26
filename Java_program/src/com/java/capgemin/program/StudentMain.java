package com.java.capgemin.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student(12,"sunil","A",1,"amit",3);
        Student s2=new Student(12,"sunita","B",2,"amit",3);
        Student s3=new Student(12,"binita","B",3,"amit",3);
        Student s4=new Student(12,"sunil","A",4,"amit",3);
        Student s5=new Student(12,"anita","C",6,"amit",3);
        Student s6=new Student(12,"sunil","A",8,"amit",3);
        Student s7=new Student(12,"sunil","C",9,"amit",3);
        Student s8=new Student(12,"sunil","A",1,"amit",3);
        List<Student> list= Arrays.asList(s1,s2,s2,s4,s5,s6,s7,s8);
        Map<String ,List<Student>> mapo=
        list.stream().filter(x->x.getStandard()==3).collect(Collectors.groupingBy(Student::getDivision,Collectors.toList()));
        System.out.println(mapo);

        int i = 15623;
        String s=String.valueOf(i);

        String p[]=s.split("");
        List<String> ddjhkk=
        Arrays.stream(p).collect(Collectors.toList());//.stream().mapToDouble(Integer::intValue).sum()
        int htry=
        ddjhkk.stream().map(Integer::parseInt).mapToInt(Integer::intValue).sum();
        System.out.println(htry);

        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        //IntStream.rangeClosed(1,11).forEach(x);

       // int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

       // System.out.println(Arrays.toString(reversedArray));






    }
}
