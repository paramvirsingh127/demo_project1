package src.ComparableAndCompara;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorClass {
    // it is comparator class which provide compare method and we compare multiple data
    public static void main(String[] args) {
        ArrayList<StudentComparator> list=new ArrayList<>();
        list.add(new StudentComparator(14,"karan",1425));
        StudentComparator s=new StudentComparator(2,"aman",142);
        list.add(s);
        // we want to display our list
        System.out.println(list);

        // we want to sort by roll no than we will create RollnoComparator new class
        Collections.sort(list,new RollnoComparator());
        System.out.println(list);
        // we want to sort by String name than we will create NameComparatore new class
        Collections.sort(list,new NameComparator());
        System.out.println(list);
    }


}
