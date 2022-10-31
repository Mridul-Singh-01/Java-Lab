class Super {
    private void private_method() {
        System.out.println("This is a private method");
    }

    private int private_variable = 15;
    public int variable = 20;

    public void public_method() {
        System.out.println("Super public method");
        private_method();
        System.out.println("Super private variable of the class: " + private_variable);
    }
}

public class Exp3_Program1 extends Super {
    public static void main(String[] args) {
        Exp3_Program1 obj = new Exp3_Program1();
        System.out.println(obj.variable);
        obj.public_method();
    }
}