package src.interview;

public class HashMapTraversalMap {
    //18.	HashMap Traversal program : how many ways we can traverse Hashmap

    public static void main(String[] args) {
        String s="paramvir";
        String s1="paramvir";
        String s2= new String("paramvir");
        String s3= new String("paramvir");
        if (s==s1){
            System.out.println("s and s1 is store same memory location ");
        }
        if (s==s2){
            System.out.println("s and s2 is same then store same memory location");
        }
        else {
            System.out.println("s and s2 is not same ");
        }
        if (s2==s3){
            System.out.println("s2 and s3 is same and store same location");
        }
        else {
            System.out.println("s2 and s3 is not same ");
        }

    }
}
