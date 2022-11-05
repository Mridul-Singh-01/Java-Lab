import java.util.Scanner;

public class Exp1_Program2 {
    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int division(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exp1_Program2 calc = new Exp1_Program2();
        int a, b;
        int choice = 0;
        while (choice >= 0) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter First numbers: ");
                    a = sc.nextInt();
                    System.out.println("Enter Second numbers: ");
                    b = sc.nextInt();
                    System.out.println("Addition: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.println("Enter First numbers: ");
                    a = sc.nextInt();
                    System.out.println("Enter Second numbers: ");
                    b = sc.nextInt();
                    System.out.println("Subtraction: " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Enter First numbers: ");
                    a = sc.nextInt();
                    System.out.println("Enter Second numbers: ");
                    b = sc.nextInt();
                    System.out.println("Multiplication: " + calc.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Enter First numbers: ");
                    a = sc.nextInt();
                    System.out.println("Enter Second numbers: ");
                    b = sc.nextInt();
                    System.out.println("Division: " + calc.division(a, b));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    choice = -1;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
