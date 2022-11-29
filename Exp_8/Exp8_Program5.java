package Exp_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Exp8_Program5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println("Original ArrayList: " + list);
        System.out.println("Duplicate ArrayList: " + list);
        System.out.println("Elements of ArrayList by using Iterator: ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}