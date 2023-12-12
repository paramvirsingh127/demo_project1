package src.interview;

public class CountNumberofCharector {
    //8.	Java Program to count the total number of characters in a string or occurrence of character
    // or find duplicate characters.


    public void countStringwithoutgap(){
        String stringwithoutgap= "this a cow";
        int Stringsizewithoutgap= stringwithoutgap.trim().length();
        System.out.println(Stringsizewithoutgap);
    }
    public void Duplicatecharacter() {
        String s="the power of world";
        int count=0;
        // convert String to char array
        char string[] =s.toCharArray();
        System.out.println("duplicate character in String ");
        //Counts each character present in the string

        for (int i=0; i< string.length; i++){
            for (int j=i+1; j<string.length; j++){
                if (string[i] == string[j]){
                    //Set string[j] to 0 to avoid printing visited character
                    System.out.println(string[j]);
                    count++;
                    break;
                }
            }

        }

    }


    public static void main(String[] args) {
        CountNumberofCharector obj=new CountNumberofCharector();
        obj.countStringwithoutgap();
        //obj.Duplicatecharacter();

    }
}
