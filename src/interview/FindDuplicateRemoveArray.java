package src.interview;

import java.util.*;

import static java.util.Collections.list;

public class FindDuplicateRemoveArray {
    //14.	Find duplicates and remove duplicates from Arraylist

    public void strings() {

        List<String> list = new ArrayList();
        list.add("karan");
        list.add("aman");
        list.add("salaman");
        list.add("karan");
        list.add("aman");
        list.add("salaman");
        list.add("amerdeep");
        list.add("salaman khan");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(1));
        for (int i=0; i<list.size();i++){
            for (int j=i+1; j<list.size(); j++){
                if (list.get(i)==list.get(j)){
                    list.remove(list.get(j));
                    System.out.println(list);

                }

            }
        }

    }
    public void Integers(){
        List<Integer> lists= new ArrayList();

        lists.add(25);
        lists.add(28);
        lists.add(27);
        lists.add(22);
        lists.add(25);
        lists.add(28);
        System.out.println(lists);
        Collections.sort(lists);
        System.out.println(lists);





    }

    public static void main(String[] args) {
        FindDuplicateRemoveArray obj=new FindDuplicateRemoveArray();
        obj.strings();
        obj.Integers();

    }
}
