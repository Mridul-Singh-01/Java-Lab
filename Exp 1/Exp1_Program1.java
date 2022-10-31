public class Exp1_Program1 {

    int largest(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        Exp1_Program1 obj = new Exp1_Program1();
        System.out.println("Largest Number is :"+ obj.largest(40, 20, 90));
    }
}