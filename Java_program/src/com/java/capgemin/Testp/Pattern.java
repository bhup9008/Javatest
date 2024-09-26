package com.java.capgemin.Testp;

public class Pattern {
    public static void main(String[] args) {

        int n=5;
        /*for(int i=5;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
