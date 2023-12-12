package src.ArrayPractice;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int param[]= {25,36,47,88,4,45,47,45};

        for (int i=0; i< param.length;i++){
            for(int j=i+1; j< param.length;i++) {
                if (param[i]==param[j]) {
                    System.out.println(param[i]);

                }
            }

        }
        
    }
}
