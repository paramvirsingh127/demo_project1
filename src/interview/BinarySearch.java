package src.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    //17. Searching an element in Arraylist : binary search

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(25);
        arr.add(36);
        arr.add(48);
        arr.add(89);
        System.out.println(arr);
        System.out.println("enter search key ");
        Scanner sc=new Scanner(System.in);
        int  key= sc.nextInt();
       try {
           int index = Collections.binarySearch(arr, key, Collections.reverseOrder());
       }
       catch (Exception e){
           System.out.println("exception "+e);
       }
       int ind= Collections.binarySearch(arr,key);
        System.out.println(ind);

    }
}
