package Exp_5;
import Exp_5.Exp5_Program1;
class Class_3 implements Abc{
    public void sum(int x,int y){
        System.out.println("The sum of numbers is :"+(x+y));
    }
}
class Class_4 extends Class_1{
    void display(){
        System.out.println("This is my protected variable :"+a);
        System.out.println("This is my public  variable :"+b);
        System.out.println("This is my Default  variable :"+c);
    }
}
public class Exp5_Program2 extends Exp5_Program1{
    public static void main(String[] args) {
        Class_4 c4=new Class_4();
        c4.display();
        Class_3 c3=new Class_3();
        c3.sum(40, 80);
        Exp5_Program2 c5=new Exp5_Program2();
        c5.sum(c5.a, c5.b);
    }
}