package src.swapnumber;

import java.math.BigInteger;
import java.util.Scanner;

public class AddLargestNumber {
    public static void main(String[] args) {
        String number1, number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of first number");
        number1=sc.nextLine();
        System.out.println("Enter value of second number");
        number2=sc.nextLine();
        BigInteger first=new BigInteger(number1);
        BigInteger second=new BigInteger(number2);
        BigInteger sum;
        sum=first.add(second);
        System.out.println("Result of addition : "+sum);

    }

}
