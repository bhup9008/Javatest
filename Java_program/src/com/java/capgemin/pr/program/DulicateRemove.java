package com.java.capgemin.pr.program;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DulicateRemove {

    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
    public static int removeDuplicate(int x[]){

        int l=x.length;
        //int []temp=new int[l];
        int j=0;
        Arrays.sort(x);
        for(int i=0;i<l-1;i++){
            if(x[i]!=x[i+1]){
                x[j++]=x[i];
            }

        }
        x[j++] = x[l - 1];
       /* for (int i = 0; i < j; i++) {
            x[i] = temp[i];
        }*/

        return j;
        //return j;
    }

    public static void main(String[] args) {
        int a[]={45,45,3,3,35,5,233,23,98,45,98,45,300};
        int n=a.length;
        n=removeDuplicate(a);
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
    }

        removeDuplicates(a);
    }
}
