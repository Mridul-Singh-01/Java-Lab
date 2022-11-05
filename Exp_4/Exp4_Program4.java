interface B {
    void division(int a,int b);
    void modules(int a,int b);
}

class stud implements B {
    int div, mod;

    public void division(int a,int b) {
         div=a/b;
    }

    public void modules(int a,int b) {
        mod = a%b;
    }

    void disp() {
        System.out.println("Division :" + div);
        System.out.println("Modules :" + mod);
    }
}

public class Exp4_Program4 {
    public static void main(String args[])
    { 
        stud s=new stud();
        s.division(5,3);
        s.modules(15,6);
        s.disp();
    }
}
