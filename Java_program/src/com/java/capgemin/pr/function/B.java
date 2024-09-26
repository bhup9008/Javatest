package com.java.capgemin.pr.function;

public interface B {
    default void log(String str){
        System.out.println("I2 logging::BBBBB"+str);
    }
}
