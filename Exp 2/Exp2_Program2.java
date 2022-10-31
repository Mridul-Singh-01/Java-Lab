import java.util.Scanner;
public class Exp2_Program2 {
    int[] array_input(){
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 numbers");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    int[] square(int arr[]){
        int arr1[] = new int[10];
        for(int i=0;i<10;i++){
            arr1[i] = arr[i]*arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        Exp2_Program2 obj = new Exp2_Program2();
        int arr[] = obj.array_input();
        int arr1[] = obj.square(arr);
        System.out.println("The square of the numbers are");
        for(int i=0;i<10;i++){
            System.out.println(arr1[i]);
        }
    }
}
