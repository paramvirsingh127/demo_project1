package src.ifElseCondition;

import com.sun.source.doctree.SeeTree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Hasms {
    public void createMap(){
        HashMap<String,Integer> maps= new HashMap<>();
        maps.put("kalam",25);
        maps.put("aman",25);
        System.out.println(maps);

    }

    public static void main(String[] args) {
        Hasms obj=new Hasms();
        obj.createMap();
    }
}
