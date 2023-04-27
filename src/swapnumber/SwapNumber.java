package src.swapnumber;
import java.math.BigInteger;
import java.util.Scanner;
public class SwapNumber {
    // swap number in java
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("enter value of x and y");

        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("before swap "+x+"\n"+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("after swap "+x +"\n "+y);
        // how to add to number of java
        temp=x+y;
        System.out.println("Sum of two integer number : "+temp);

    }

}
