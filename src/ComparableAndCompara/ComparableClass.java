package src.ComparableAndCompara;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableClass {
    public static void main(String[] args) {

        ArrayList<EmpClass> list=new ArrayList<>();
        EmpClass emp= new EmpClass(25,"harjeet",2532);
        EmpClass emp2= new EmpClass(24,"karan",1426);
        list.add(new EmpClass(23,"paramvir",1426));
        list.add(emp);
        list.add(emp2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
