package src.interview;

import java.math.BigInteger;
import java.util.Scanner;

public class FactoNumber {
    public static void main(String[] args) {
        //5.	Java Program to Find Factorial of a Number

        int n=5;

        int c, fact=1;

        if(n<0){
            System.out.println("Number should be no- negative");
        }else {
            for(c=1; c<=n; c++) {
                fact=fact*c;
                System.out.println("factorial of "+n+" is = "+fact);
            }
        }
        // factorial of large number


    }

}
