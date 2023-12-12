package src.interview;

import src.ComparableAndCompara.EmpClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArray {
    //15.	Arraylist sorting program
    public static void main(String [] arg){
        ArrayList<EmpClass> list = new ArrayList<>();
        list.add(new EmpClass(1,"neeraj",1521));
        list.add(new EmpClass(3,"arman",1425));
        list.add( new EmpClass(2,"paramvir",253));

        list.add(new EmpClass(4,"karan",1425));
        list.add(new EmpClass(5,"alkayada",4152));
        Collections.sort(list);
        System.out.println(list);
    }
}
