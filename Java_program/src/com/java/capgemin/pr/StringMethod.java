package com.java.capgemin.pr;

import java.util.*;
import java.util.concurrent.ExecutorService;

public class StringMethod {
    public static void main(String[] args) {
        /*String str="bhupendra";
        //str.concat("kumar");
        System.out.println(str.concat("kumar"));
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));*/

        List<Integer> list= Arrays.asList(12,2,34,16,1233,1988);

        for(Integer in:list){
            int x=in%10;
            if(x==4){
                System.out.println(in);
            }
            /*String s=""+in;
            char i=s.charAt(0);
            Integer it=Integer.parseInt(""+i);
            //Integer firstDigit = Integer.parseInt(Integer.toString(in).substring(0, 1));
            if(it==1){
                System.out.println(in);
            }*/
        }
        /*Iterator<Integer> it=list.iterator();
        Map<Integer,Integer> map=new IdentityHashMap<>();
        while (it.hasNext()){
           // System.out.println(it.next());
            Integer firstDigit = Integer.parseInt(Integer.toString(it.next()).substring(0, 1));

            if(firstDigit==1){
                System.out.println(it.next());
            }

        }*/
    }
}
