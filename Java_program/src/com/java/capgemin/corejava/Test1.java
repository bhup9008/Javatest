package com.java.capgemin.corejava;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
      String str="cap",rev="";
        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); //extracts each character
            rev= ch+rev; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ rev);
    }



}
