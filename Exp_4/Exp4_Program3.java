interface Demo {
    final double pi = 3.14;
}
public class Exp4_Program3 implements Demo {
    double area_cylinder(int r,int h) {
        return 2 * pi * r * h;
    }

    public static void main(String[] args) {
        Exp4_Program3 obj = new Exp4_Program3();    
        double a = obj.area_cylinder(15,10);
        System.out.println("Area of Cylinder :"+ a);
    }
}