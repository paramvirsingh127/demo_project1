package src.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadFileCount {
    //todo 9.	Java Program to read a file and find to count the total number of words in a string Sentences
    // or occurrence of word or find duplicate words.
    public static void main(String[] args) throws Exception{
        String line;
        int count= 0;

        FileReader file = new FileReader("");

        BufferedReader br = new BufferedReader(file);

        while ((line= br.readLine())!= null){

            String words[] = line.split("");

            count = count+ words.length;
        }
        System.out.println("number of words present in given ");
        br.close();
    }

}
