package com.java.capgemin.pr.program;

public class SortArrays {

    public static int [] sortArray(int []x){
        int l=x.length;
        int temp=0;
        for(int i=0;i<l-1;i++){
            if(x[i]>x[i+1]){
                temp=x[i];
                x[i]=x[i+1];
                x[i+1]=temp;
                i=-1;
            }
        }
        return x;
    }

    public static void main(String[] args) {

        int a[]={23,3,1,23,3,56,2,5};
        int y[]=sortArray(a);
        for(int j=0;j<y.length;j++){
            System.out.print(y[j]+" ");
        }
    }
}
