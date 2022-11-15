
// import java.sql.*;

// class MysqlCon {
//     public static void main(String args[]) {
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//             Connection con = DriverManager.getConnection(
//                     "jdbc:mysql://localhost:3306/sonoo", "root", "root");
//             // here sonoo is database name, root is username and password
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from emp");
//             while (rs.next())
//                 System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//             con.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
class Student {
    public String Name;
    public int Roll_No;

    public Student() {
    };

    public Student(String N, int R) {
        Name = N;
        Roll_No = R;
        System.out.println("Name : " + Name + " " + "Roll_no : " + Roll_No);
    }

    public void print(String P, int K) {
        Name = P;
        Roll_No = K;
        System.out.println("Name : " + Name + " " + "Roll_no : " + Roll_No);
    }
}

public class Exp9_Program1 {
    public static void main(String[] args) {
        Student[] Stu;
        Stu = new Student[10];
        Stu[0] = new Student("sumyak", 91);
        Stu[1] = new Student("gaurav", 92);
        Stu[2] = new Student("rd", 93);
        Stu[3] = new Student("kd", 94);
        Stu[4] = new Student("munaf", 95);
        Stu[5] = new Student("rathore", 96);
        Stu[6] = new Student("loki", 97);
        Stu[7] = new Student("piyush", 98);
        Stu[8] = new Student("duggal", 99);
        Stu[9] = new Student("arjun", 100);
        try {
            Stu[10] = new Student();
            Stu[10].print("sidhu", 111);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not cross size of array sir." + e);
        }
    }
}