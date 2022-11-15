package Exp_6;

class Non extends Exception {
    Non() {
        super("The value is non numeric \n");
    }
}

public class Exp6_Program3 {
    public static void main(String ar[]) {
        int a, b, c = 0;
        System.out.println("Name : Mridul, Batch:- B1(H) of Devops");
        try {
            a = Integer.parseInt(ar[0]);
            throw new Non();
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (Non e) {
            System.out.println(e);
        }
    }
}
