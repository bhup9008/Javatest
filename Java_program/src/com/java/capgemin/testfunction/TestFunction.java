package com.java.capgemin.testfunction;

public class TestFunction implements Functiontest{
    @Override
    public void test() {

    }

    @Override
    public void log(String str) {
        System.out.println("TestFunction class method override");
        //Functiontest.super.log(str);
    }

    public static void main(String[] args) {
        TestFunction f=new TestFunction();
        f.log("test in main");
    }
}
