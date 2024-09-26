package com.java.capgemin.pr.function;
@FunctionalInterface
public interface A {
    public void m();

    default void log(String str){
        System.out.println("I2 logging::AAAAAAAA"+str);
    }
}
