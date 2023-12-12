package src.interview;

public class FrequancyElement {
    //6. Java Program to find frequency of any element of an array, find duplicate

    public static void main(String[] args) {
        int [] arr = new int []{1,4,7,5,3,6,9,3,7,4};

        int [] fr= new int[arr.length];
        int visited = -1;
        for (int i=0; i< arr.length; i++){
            int count =1;

            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                    fr[j] =visited;

                }
            }
            if (fr[i] != visited)
            fr[i]=count;
        }
        //Displays the frequency of each element present in array

        System.out.println("-------------------------");
        System.out.println("Element | Frequency");
        System.out.println("-------------------------");
        for (int i=0; i<fr.length; i++){
            if (fr[i] != visited)
                System.out.println("  "+arr[i]+" | "+fr[i]);
        }
        System.out.println("-------------------------");
    }
}
