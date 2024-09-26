package com.java.capgemin.testfunction;
@FunctionalInterface
public interface Functiontest {

    void test();
    default void log(String str){
        System.out.println("I2 logging::AAAAAAAA"+str);
    }
}
