package Exp_6;

public class Exp6_Program5 {
    String name;
    int age;

    public static void main(String[] args) {
        Exp6_Program5 employee = new Exp6_Program5();
        employee.name = "345";
        employee.age = 90;
        try {
            Integer.parseInt(employee.name);
            throw new nameException("Employee Name cannot be a number");
        } catch (nameException err) {
            System.out.println(err);
        }
        try {
            if (employee.age > 50) {
                throw new ageException("Employee Age should be less than 50");
            }
        } catch (ageException err) {
            System.out.println(err);
        }
    }
}

class nameException extends Exception {
    public nameException(String msg) {
        System.out.println(msg);
    }
}

class ageException extends Exception {
    public ageException(String msg) {
        System.out.println(msg);
    }
}
