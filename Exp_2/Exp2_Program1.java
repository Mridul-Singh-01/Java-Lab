import java.util.Scanner;

public class Exp2_Program1 {
    public void combinations(int[] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (arr[i] != arr[j] && arr[j] != arr[k] && arr[k] != arr[i]) {
                        System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Digit");
        int firstNum = sc.nextInt();
        System.out.println("Enter The Second Digit");
        int secondNum = sc.nextInt();
        System.out.println("Enter The Third Digit");
        int thirdNum = sc.nextInt();
        int[] arr = { firstNum, secondNum, thirdNum };
        Exp2_Program1 ob = new Exp2_Program1();
        ob.combinations(arr);
        sc.close();
    }

}
