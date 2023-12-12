package src.interview;

import java.util.ArrayList;
import java.util.Collections;

public class FindLargestArray {
    //16.	Find Largest in Array list or second largest or nth largest in ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(25);list.add(28);list.add(23);list.add(35);list.add(62);list.add(84);
        list.add(99);list.add(92);list.add(47);list.add(87);list.add(85);list.add(89);list.add(12);list.add(21);

        System.out.println(list.get(4));

        // First logic for find out max number of the list

        int maximum = list.get(0);
        for (int i=0; i<list.size(); i++){
            if (maximum< list.get(i))
                maximum = list.get(i);
        }
        System.out.println(maximum);

        // Second logic using to find max number of array list

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
