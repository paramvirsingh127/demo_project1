package src.ifElseCondition;

import java.util.Scanner;

public class FindNoIfelst {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        a =sc.nextInt();
        System.out.println("Enter value of b");
        b=sc.nextInt();
        System.out.println("Enter value of c");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is largest number");
        } else if (b>a && b>c) {
            System.out.println("B is largest number");
        } else if (c>a && c>b) {
            System.out.println("C is largest number");
        }
        else {
            System.out.println("nothing all number's value is null");
        }
        {

        }
    }
}
