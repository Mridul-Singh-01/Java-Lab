class Class {
    void A(int x) {
        System.out.println("x = " + x);
    }

    int a = 100;
}

public class Exp1_Program3 {
    public static void main(String[] args) {
        Class obj = new Class();
        System.out.println("obj.a = " + obj.a);
        obj.A(200);
    }
}
