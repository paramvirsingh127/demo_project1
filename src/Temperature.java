package src;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        float temperature;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        temperature=sc.nextFloat();
        temperature = ((temperature-32)*5)/9;
        System.out.println(temperature);

    }
}
