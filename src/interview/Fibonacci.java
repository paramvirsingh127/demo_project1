package src.interview;

public class Fibonacci {
    //4. Java Program to Display Fibonacci Series

    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3, i, count=10;

        System.out.println(n1+"\n "+n2);

        for (i=2; i<count; i++){
            n3 =n1+n2;
            System.out.println(" "+n3);

            n1 =n2;
            n2 = n3;
        }
    }

}
