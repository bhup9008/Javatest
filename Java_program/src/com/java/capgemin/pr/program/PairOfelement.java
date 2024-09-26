package com.java.capgemin.pr.program;

public class PairOfelement {
    public static boolean pairdata(int[] x,int l,int num){

        for(int i=0;i<l-1;i++){
            for (int j=i+1;j<l;j++){
                if(x[i]+x[j]==num){
                return true;
                }
            }
        }


        return false;
    }


    public static void main(String[] args) {
        int x[]={1,-2,};
        int l=x.length;
        int num=-1;
        pairdata(x,l,num);

        if(pairdata(x,l,num)){
            System.out.println("yes");
        }else {
            System.out.println("NO");
        }

    }
}
