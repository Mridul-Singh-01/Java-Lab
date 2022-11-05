import java.util.Scanner;

interface Test {
    public int square(int a);
}

class Arthimatic implements Test {
    public int square(int a) {
        return a * a;
    }
}

public class Exp4_Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, result;
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        Arthimatic obj = new Arthimatic();
        result = obj.square(a);
        System.out.println("Square of Number : " + result);
        sc.close();
    }
}