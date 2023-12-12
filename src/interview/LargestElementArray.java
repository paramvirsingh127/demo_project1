package src.interview;

public class LargestElementArray {
    //todo 7. Java Program to find the largest element in Array or second largest or nth Largest element.
    public void largestNum(){
    int[] aray = {25, 16, 34, 78, 9, 63, 45};
    int max = aray[0];
        for(int i = 0; i<aray.length;i++) {
        if (aray[i] > max)
            max = aray[i];
    }
            System.out.println("largest element of array : "+max);
        }
        public void secondlargest(){
            int[] aray = {25, 16, 34, 78, 9, 63, 45};
            int  temp;
            for (int i=0;i<aray.length;i++){
                for (int j=i+1;j<aray.length;j++){
                    if (aray[i]>aray[j]){
                        temp= aray[i];
                        aray[i]=aray[j];
                        aray[j]= temp;
                    }
                }
            }
            System.out.println(aray[aray.length-2]);
        }

    public static void main(String[] args) {
        LargestElementArray obj= new LargestElementArray();
        obj.largestNum();
        obj.secondlargest();

    }
}
