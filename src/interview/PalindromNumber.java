package src.interview;

import java.util.Scanner;

public class PalindromNumber {
    //3.	Java Program to Check Whether a Number is Palindrome or Not
    public void simple() {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r;
        int sum=0;
        int temp;
        temp= n;
        while (n>0){
            r =n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("this is palindrome number");
        }
        else {
            System.out.println("this is not palindrome number");
        }
    }


    public static void main(String[] args) {
        PalindromNumber number=new PalindromNumber();
        number.simple();

    }
}
