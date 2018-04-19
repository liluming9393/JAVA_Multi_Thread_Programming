package chapter3_1_4;

import java.util.ArrayList;
import java.util.List;

public class Mylist {
    private static List list = new ArrayList();
    public static void add(){
        list.add("anything");
    }
    public static int size(){
        return list.size();
    }
}
