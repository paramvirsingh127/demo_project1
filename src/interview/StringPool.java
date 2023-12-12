package src.interview;

public class StringPool {
    public static void main(String[] args) {


        //TODO String pool
        String s = new String("karan");
        String s1 = "karan";
        String s2= new String("karan");
        if (s == s1) {
            System.out.println(s+" is store in different memory area");
        } else{
            System.out.println("not store data in memory");
        }
            if (s==s2) {
            System.out.println(s+" store in same memory area");
        }
        else {
            System.out.println("String is not store");
        }

    }
}
