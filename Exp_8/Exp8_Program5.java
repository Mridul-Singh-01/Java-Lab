package Exp_8;

import java.util.*;

public class Exp8_Program5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println("Original ArrayList: " );
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        for(int i=0;i<list.size();i++){
            list1.add(list.get(i));
        }
        System.out.println("Duplicate ArrayList: " + list1);
        System.out.println("Reversed array : ");

        Collections.reverse(list1);
        Iterator<String> itr1 = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr1.next());
        }
        

    }
}