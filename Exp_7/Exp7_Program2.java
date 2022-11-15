package Exp_7;
import java.util.Scanner;

public class Exp7_Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("Enter the string - ");
        str = sc.nextLine();
        sc.close();
        capital(str);
    }

    public static void capital(String str) {
        StringBuffer stb = new StringBuffer();
        stb.append(str);
        for (int i = 0; i < stb.length(); i++) {
            char xyz;
            xyz = stb.charAt(i);
            if (96 < xyz && xyz < 128) {
                xyz = (char) (xyz - 32);
                String c = Character.toString(xyz);
                stb.replace(i, i + 1, c);
            }
        }
        System.out.println(stb);
    }
}