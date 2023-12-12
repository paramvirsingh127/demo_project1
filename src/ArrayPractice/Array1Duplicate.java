package src.ArrayPractice;

import java.util.Arrays;

public class Array1Duplicate {

    static void integer() {
        //public static void main(String[] args) {
        int Array[] = {25, 14, 47, 95, 67, 4, 5, 8, 8, 9,9, 48};
        System.out.println(Array.length);

        Arrays.sort(Array, 0, Array.length);
        for (Integer var : Array) {
            System.out.print(" " + var);
        }
        // find the duplicate
        for (int i=0; i<Array.length; i++){
            for (int j=i+1;j<Array.length;j++){
                if (Array[i]==Array[j]){

                    System.out.println(" \n"+Array[j]);
                }
            }
        }
    }
    static void string(){

        String stringArray []  ={"karan","suman","salman","jyoti","arti","giri","pooja"};
        Arrays.sort(stringArray,0,7);
        for (String var: stringArray) {
            System.out.println(var);
        }
    }
    public static void main(String[] args) {

        integer();
        string();
    }
}
