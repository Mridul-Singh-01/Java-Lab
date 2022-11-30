package Exp_8;

import java.util.*;

public class Exp8_Program7 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println("Original HashSet: " + set);
        HashSet<String> set1 = new HashSet<String>();
        set1.add("6");
        set1.add("7");
        set1.add("8");
        set1.add("9");
        set1.add("10");
        set.addAll(set1);
        System.out.println("HashSet after adding another collection: " + set);
        set.clear();
        System.out.println("HashSet after clearing all elements: " + set);
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println("HashSet after adding elements again: " + set);
        System.out.println("Is 1 present in the HashSet? " + set.contains("1"));
        System.out.println("Is 11 present in the HashSet? " + set.contains("11"));
        System.out.println("All elements in the HashSet: " + set);
        for (String i : set) {
            System.out.println("Element: " + i);
        }
    }
}


