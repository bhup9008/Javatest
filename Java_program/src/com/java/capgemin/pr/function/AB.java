package com.java.capgemin.pr.function;

public class AB implements A,B{
    @Override
    public void m() {

    }

    @Override
    public void log(String str) {
        A.super.log(str);
        B.super.log(str);
    }

    public static void main(String[] args) {
        AB ab=new AB();
        ab.log("ddsdffd");
    }


}
