package Exp_7.WapperClass;

public class Exp7_Program2b {
    float x = 70.8f;
    Float y = 85.5f;
    String z = "66.5";
    String d = "88.3";

    public void floatToFloat() {
        System.out.println("float to Float: " + Float.valueOf(x));
    }

    public void floatToString() {
        System.out.println("Float to String: " + y.toString());
    }

    public void stringToFloat() {
        System.out.println("String to float: " + Float.parseFloat(z));
    }

    public void floatToString2() {
        System.out.println("float to String: " + String.valueOf(x));
    }

    public void stringToFloat2() {
        System.out.println("String to Float: " + Float.valueOf(z));
    }

    public void floatToFloat2() {
        System.out.println("Float to float: " + y.floatValue());
    }

    public static void main(String[] args) {
        Exp7_Program2b obj = new Exp7_Program2b();
        obj.floatToFloat();
        obj.floatToString();
        obj.stringToFloat();
        obj.floatToString2();
        obj.stringToFloat2();
        obj.floatToFloat2();
    }
}