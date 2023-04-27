package src;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
       int a;
       float b;
       String c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter candidate name");
        c =in.nextLine();
        System.out.println("enter Roll no ");
        a =in.nextInt();
        System.out.println("enter salary ");
        b=in.nextFloat();

        System.out.println("Enter value by u "+"\nName: "+c+"\n Roll no: "+a+"\n Salary: "+b);


    }
}
