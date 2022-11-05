import java.util.Scanner;

public class Exp1_Program4 {
    Scanner sc = new Scanner(System.in);

    int[] accept_marks() {
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter sorted_marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    int[] sort(int[] marks) {
        int temp;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (marks[i] > marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        return marks;
    }

    public static void main(String[] args) {
        Exp1_Program4 obj = new Exp1_Program4();
        int[] marks = obj.accept_marks();
        int[] sorted_marks = obj.sort(marks);
        for (int i = 0; i < 10; i++) {
            if (sorted_marks[i] < 40) {
                System.out.println(sorted_marks[i] + " - Fail");
            } else if (40 <= sorted_marks[i] && sorted_marks[i] <= 50) {
                System.out.println(sorted_marks[i] + " - Pass");
            } else if (51 <= sorted_marks[i] && sorted_marks[i] <= 75) {
                System.out.println(sorted_marks[i] + " - Merit");
            } else {
                System.out.println(sorted_marks[i] + " - Excellent");
            }
        }
    }

}
