package src.interview;

import java.util.Scanner;


public class StringPalindrome {
    //11.	Java Program to determine whether a given string is palindrome
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of String to check palindrome or not");
        String  reverse = " ";
        String original =sc.nextLine();
        int length=original.length();
        for (int i=length-1; i>=0;i--){
            reverse  += original.charAt(i);
            if (original.equals(reverse)){
                System.out.println("enter String is palindrome ");
            }
            else {
                System.out.println("enter string is not palindrome");
            }
        }
    }
}
