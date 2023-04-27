package src.ifElseCondition;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println("even number: "+i);
        }else {
            System.out.println("Odd number : "+i);
        }
    }
}
