package src.interview;



public class ReverseString {
    //12.	Java Program to find Reverse of the string

    public void stringreverse(){
        String s= "this is a string";
        String s1= " ";
        for (int i= s.length()-1; i>=0;i--){
            s1 += s.charAt(i);
        }
        System.out.println(s1);
    }
    public  void Stringword(){
        String s2="this is word";
        String string=" ";
        char[] array= s2.toCharArray();

        for (int i= array.length-1;i>=0;i--){

            string += s2.charAt(i);

        }
    }

    public static void main(String[] args) {
        ReverseString r=new ReverseString();
        r.stringreverse();
        r.Stringword();
    }

}
