package com.java.capgemin.Testp;

public class Singleton {

    private static volatile Singleton single=null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(single==null){
        synchronized (Singleton.class){
            if(single==null){
                single=new Singleton();
            }
        }}

        return single;

    }

    public static void main(String[] args) {
        Singleton s3=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());

        String s = "PrePInsTa#@";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                s1 = s1 + Character.toLowerCase(s.charAt(i));
            }if(Character.isLowerCase(s.charAt(i))) {
                    s1 = s1 + Character.toUpperCase(s.charAt(i));
                }else {
                s1 = s1+s.charAt(i);
            }

        }
        System.out.println("Toggle String is : "+s1);
    }



}
