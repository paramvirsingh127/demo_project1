package src.ifElseCondition;

import java.util.Scanner;

public class ListOfEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of start point");
        int start=sc.nextInt();
        System.out.println("Enter value of end point");
        int end =sc.nextInt();
        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println("Even number "+i);
            }
            else {
                System.out.println("Odd number "+i);
            }
        }
    }
}
