package com.java.capgemin.pr;

public class MagicNumber {
    public static void main(String[] args) {
        int number=532, remainder=1,sum=0;
        while (number > 9)               //while(number > 0 || sum > 9)
        {
            while (number > 0)
            {

                remainder = number % 10;
                sum = sum + remainder;
                number = number / 10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1)
        {
            System.out.println("The given number is a magic number.");
        }
        else
        {
            System.out.println("The given number is not a magic number.");
        }

}
}
