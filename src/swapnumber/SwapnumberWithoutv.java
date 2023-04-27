package src.swapnumber;

import java.util.Scanner;

public class SwapnumberWithoutv {
    public static void main(String[] args) {
        int x, y;
        // Swap print two variable without third variable

        System.out.println("Enter value of x and y");
        Scanner sc =new Scanner(System.in);
        x =sc.nextInt();
        y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("first swap number :"+x +"\nsecond swap number :"+y);
    }

}
