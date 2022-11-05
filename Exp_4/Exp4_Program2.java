interface A {
    public int meth1(int a,int b);
    public int meth2(int a,int b);
}
class Myclass implements A {
    public int meth1(int a,int b) {
        return a + b;
    }
    public int meth2(int a,int b) {
        return a * b;
    }
}
public class Exp4_Program2 {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        System.out.println("Sum of 4 and 3 is " + obj.meth1(4, 3));
        System.out.println("Product of 2 and 3 is " + obj.meth2(2, 3));
    }
}
