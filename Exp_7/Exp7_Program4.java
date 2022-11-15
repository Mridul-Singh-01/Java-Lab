package Exp_7;

import java.util.*;

public class Exp7_Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter your Name - ");
        str = sc.nextLine();
        sc.close();
        occurrences(str);
    }

    public static void occurrences(String str) {
        int len;
        len = str.length();
        int c = 0;
        if (str.indexOf('a') == -1 && str.indexOf('A') == -1) {
            System.out.println("No 'a' Present");
        } else {
            System.out.println("\nLocation of occurance---");
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == 'a' && str.charAt(i) == 'a') {
                    c++;
                    System.out.print(i + "  ");
                }

            }
            System.out.println("\nTotal Occurances - " + c);
        }
    }
}