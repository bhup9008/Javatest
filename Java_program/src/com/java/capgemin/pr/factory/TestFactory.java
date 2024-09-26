package com.java.capgemin.pr.factory;

public class TestFactory {
    public static void main(String[] args) {
        AuthentionServer pc = AuthFactory.getAuthServerIns("face");
        AuthentionServer pc1 = AuthFactory.getAuthServerIns("aple");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+pc1);
    }
}
