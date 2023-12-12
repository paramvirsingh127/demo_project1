package src.interview;

public class FindLargestSmallest {
    //13.	Java Program to find the largest and smallest word in a string
    public static void main(String[] args) {
        String name= "South india culture is the famous in whole world a paramvir";
        System.out.println(name);
        String word = " ", small="", large="";
        String [] words= new String[100];

        int length =0;
        // Add extra space after string to get the last word in the given string

        name = name+" ";

        for (int i=0; i< name.length();i++){
            //Split the string into words

            if (name.charAt(i) != ' '){
                word= word + name.charAt(i);
            }
            else {
                //Add word to array words
                words[length] = word;
                //Increment length
                length ++;
                //Make word an empty string
                word = "";
            }
        }
        //Initialize small and large with first word in the string
        small =large =words[0];
        //Determine smallest and largest word in the string
        for (int k=0; k< length; k++){

            //If length of small is greater than any word present in the string
            //Store value of word into small

            if (small.length()> words[k].length())
                small = words[k];
            //If length of large is less than any word present in the string
            //Store value of word into large

            if (large.length()< words[k].length())
                large= words[k];

        }
        System.out.println(small);
        System.out.println(large);

    }
}
