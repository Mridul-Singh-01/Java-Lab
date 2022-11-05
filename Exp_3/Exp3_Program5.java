class Employee {
    String name;
    int empid;
    int salary;

    public Employee(String name, int empid, int salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Empid: " + empid + ", Salary: " + salary;
    }

    public void increaseSalary(int percentage) {
        salary += salary * percentage / 100;
    }
}

class Manager extends Employee {
    int incentive;

    public Manager(String name, int empid, int salary, int incentive) {
        super(name, empid, salary);
        this.incentive = incentive;
    }

    public String toString() {
        return super.toString() + ", Incentive: " + incentive;
    }

    public void increaseSalary(int percentage) {
        super.increaseSalary(percentage);
        incentive += incentive * percentage / 100;
    }
}
public class Exp3_Program5 {
    public static void main(String[] args) {
        Employee e1 = new Manager("A", 1, 1000,50);
        Employee e2 = new Manager("B", 2, 2000, 100);
        System.out.println(e1);
        System.out.println(e2);
        e1.increaseSalary(10);
        e2.increaseSalary(10);
        System.out.println(e1);
        System.out.println(e2);
    }
}