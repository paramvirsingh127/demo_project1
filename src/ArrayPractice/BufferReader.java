package src.ArrayPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*System.out.println("Input String first");
        //String input1= Arrays.toString(br.readLine().split(" ")); output: [paramvir]
        String input1= br.readLine();
        System.out.println("Input String second");
        String input2= br.readLine();
        //System.out.println(input2 + input1);*/
        int num= Integer.parseInt(br.readLine());
        for (int i=0;i<num;i++){
            System.out.println(i);
        }




    }
}
