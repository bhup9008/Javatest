package com.java.capgemin.Testp;

public class MemoryLeaksDemo {
    public static void main(String[] args) {
        int x=532;int y=789;
        System.out.println("remain two number x value "+x%10);
        System.out.println("devi two number x value "+x/10);

        int total=x+y;
        x=total-x;
        y=total-y;
        System.out.println("swip two number x value "+x);
        System.out.println("swip two number value Y value "+y);


        /*int orig = 121;
        int rev = palagram(orig);
        if (rev == orig) {
            System.out.println("palindrome ");
        } else {
            System.out.println("NOt palindrome ");
        }
*/
        int a=1, b=30, i, j, flag;
        for (i = a; i <= b; i++) {

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println(i);
        }



        //List<String> list= Arrays.asList("12sjdjais","snkndsan","56dkskk","12","photon");
         //list.stream().filter(str->(str.charAt(0) + "").equals("1")).forEach(System.out::println);


    }

    public static int palagram(int x){
        int rev=0;
        while (x>0){
           int rem= x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev;
    }



}
