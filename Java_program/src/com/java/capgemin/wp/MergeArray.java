package com.java.capgemin.wp;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArray {
    public static void main(String[] args) {
        int x[]={12,34,34,9};
        int y[]={23,56,67,88,6,6,88,56};
        //int z[]=new int[x.length+y.length];
        /*int z[]=merge(x,y);
        for (int p=0;p<z.length;p++){
            System.out.println(z[p]);
        }*/

        //int h=removeduplicate(y,y.length);
       // int n = y.length;

        // Remove duplicates and get the count of unique elements
       // n = removeduplicate(y, n);

        // Print the modified array containing unique elements
        /*for (int i = 0; i < n; i++) {
            System.out.print(y[i] + " ");
        }*/

        String str="bhupendra kamal bhupendra kumar kumar sonu";
        String split[]=str.split(" ");
        Stream.of(split).collect(Collectors.groupingBy(s->s,Collectors.counting())).
                entrySet().stream().forEach(x1->{System.out.println(x1.getValue()+":"+x1.getKey());});





    }
    public static int[] merge(int x[],int y[]){
        int z[]=new int[x.length+y.length];

        int count=0;
        for (int i=0;i<x.length;i++){
            z[i]=x[i];
            count++;
        }
        for (int j=0;j<y.length;j++){
            z[count]=y[j];
            count++;
        }
        return z;

    }


    public static int removeduplicate(int a[],int n){
        if (n <= 1)
            return n;

        // Use a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Traverse the array and add elements to the Set
        for (int i = 0; i < n; ++i) {
            uniqueElements.add(a[i]);
        }

        int index = 0;
        // Iterate through unique elements and update the original array
        for (int element : uniqueElements) {
            a[index++] = element;
        }

        // Return the count of unique elements
        return uniqueElements.size();

    }
}
