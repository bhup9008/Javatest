package com.java.capgemin.base;

public class BaseSubClass extends BaseClassEx{
    void method()throws ArithmeticException {//throws IOException {

        // IOException is of type Checked Exception
        // so the compiler will give Error

        System.out.println("SubClass");
    }
}
