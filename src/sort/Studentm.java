package src.sort;

import src.ComparableAndCompara.EmpClass;

import java.util.ArrayList;
import java.util.Collections;

public class Studentm {

    public static void main(String[] args) {
        ArrayList<EmpClass> list = new ArrayList<>();
        EmpClass emp= new EmpClass(4,"paramvir",235);
        list.add(new EmpClass(6,"singh",5462));
        list.add(new EmpClass(7,"ravi",4845));
        list.add(new EmpClass(9,"rajkumar",5462));
        list.add(new EmpClass(10,"gourav",4845));
        list.add(emp);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list);
    }

}
