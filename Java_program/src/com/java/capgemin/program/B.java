package com.java.capgemin.program;

public class B extends A {

    public static void main(String[] args) {
        try {
            //A a=new A();
            B a=new B ();
            int f=a.division();
            System.out.println(f);
        }catch (Exception e){
            e.printStackTrace();
          System.out.println(e.getMessage());
        }


    }
}
