package src.interview;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;
//10.	Java Program to determine whether two strings are the anagram
public class Anagram {
    public void SimpleMethod(){
        String s1="karan";
        String s2="karam";
        //todo we will convert String to lower case because java case-sensitive and R and r two different word

        s1= s1.toLowerCase();
        s2=s2.toLowerCase();
        //todo if we will check, String length is same or not
        if (s1.length()== s2.length()){

            //todo after we have converted String to Array
            char[] Array1 = s1.toCharArray();
            char[] Array2= s2.toCharArray();

            //todo we have sorted to array

            Arrays.sort(Array1);
            Arrays.sort(Array2);
            //todo and then we will create new object
            boolean result = Arrays.equals(Array1, Array2);

            if(result){
                System.out.println(s1+" and "+s2+ " are anagram ");
            }
            else {
                System.out.println(s1+" and "+s2+" are not anagram ");
            }
        }
        else {
            // we will check
            System.out.println(s1 + " and " + s2 + " are not anagram");
        }
    }
    public void scannerMethod(){
       Scanner sc= new Scanner(System.in);
        System.out.println("enter first String");
        String str1=sc.nextLine();
        System.out.println("Enter second String ");
        String str2=sc.nextLine();

        if(str1.length()==str2.length()){
            char[] ArrayString1= str1.toCharArray();
            char[] ArrayString2 =str2.toCharArray();

            Arrays.sort(ArrayString1);
            Arrays.sort(ArrayString2);

            boolean ScannerResult= Arrays.equals(ArrayString1,ArrayString2);
            if (ScannerResult){
                System.out.println(str1+" and "+str2+" are anagram");
            }
            else {
                System.out.println(str1+" and "+str2+" are not anagram");
            }
        }
        else {
            System.out.println(str1+" and "+str2+" are not anagram");
        }
    }

    public static void main(String[] args) {
        Anagram obj=new Anagram();
        obj.scannerMethod();
        obj.SimpleMethod();

    }

}






