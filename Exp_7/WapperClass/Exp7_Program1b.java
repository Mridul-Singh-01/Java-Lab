package Exp_7.WapperClass;

public class Exp7_Program1b {
    int a = 100;
    Integer b = 240;
    String c = "330";

    public void intToInteger() {
        
        System.out.println("int to Integer: " + Integer.valueOf(a));
    }

    public void integerToString() {
        System.out.println("Integer to String: " + b.toString());
    }

    public void stringToInt() {
        System.out.println("String to int: " + Integer.parseInt(c));
    }

    public void intToString() {
        System.out.println("int to String: " + String.valueOf(a));
    }

    public void stringToInteger() {
        System.out.println("String to Integer: " + Integer.valueOf(c));
    }

    public void integerToInt() {
        System.out.println("Integer to int: " + b.intValue());
    }

    public static void main(String[] args) {
        Exp7_Program1b obj = new Exp7_Program1b();
        obj.intToInteger();
        obj.integerToString();
        obj.stringToInt();
        obj.intToString();
        obj.stringToInteger();
        obj.integerToInt();
    }
}