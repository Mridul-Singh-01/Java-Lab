package Exp_8;

import java.util.*;

public class Exp8_Program6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");
        map.put(9, "I");
        map.put(10, "J");
        System.out.println("Original HashMap: " + map);
        System.out.println("Is key 5 present in the HashMap? " + map.containsKey(5));
        System.out.println("Is key 11 present in the HashMap? " + map.containsKey(11));
        System.out.println("Is value A present in the HashMap? " + map.containsValue("A"));
        System.out.println("Is value K present in the HashMap? " + map.containsValue("K"));
        System.out.println("All keys in the HashMap: " + map.keySet());
        for (int i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
          }
    }
}


