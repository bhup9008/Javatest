package com.java.capgemin.pr;

public class Singleton {

    private static Singleton singleton;
    private Singleton(){}

    public static Singleton getSingleton(){
        synchronized (Singleton.class) {
            if (singleton == null)
                singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s1=new Singleton();
        Singleton s2=new Singleton();
        Singleton s3=new Singleton();
        Singleton s4=Singleton.getSingleton();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2==s1);

    }

}
