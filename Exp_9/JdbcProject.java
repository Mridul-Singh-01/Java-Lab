package Exp_9;
// Database: Studento 
// Table: StuDetails(Sno, rollno, name, address, contact, course, sem)
//  Create a registration page to add details of a new student (insert query)
//  Create a page to update details of existing student (address, contact and sem)
//  Create a page to select and view data of existing student in the database (All details )


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.lang.Class;

public class JdbcProject {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            st = con.createStatement();
            System.out.println("Enter your choice:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. View");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Sno:");
                    int Sno = sc.nextInt();
                    System.out.println("Enter rollno:");
                    int rollno = sc.nextInt();
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter address:");
                    String address = sc.next();
                    System.out.println("Enter contact:");
                    int contact = sc.nextInt();
                    System.out.println("Enter course:");
                    String course = sc.next();
                    System.out.println("Enter sem:");
                    int sem = sc.nextInt();
                    ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
                    ps.setInt(1, Sno);
                    ps.setInt(2, rollno);
                    ps.setString(3, name);
                    ps.setString(4, address);
                    ps.setInt(5, contact);
                    ps.setString(6, course);
                    ps.setInt(7, sem);
                    int i = ps.executeUpdate();
                    if (i > 0) {
                        System.out.println("Record inserted successfully");
                    } else {
                        System.out.println("Record not inserted");
                    }
                    break;
                case 2:
                    System.out.println("Enter Sno:");
                    int Sno1 = sc.nextInt();
                    System.out.println("Enter address:");
                    String address1 = sc.next();
                    System.out.println("Enter contact:");
                    int contact1 = sc.nextInt();
                    System.out.println("Enter sem:");
                    int sem1 = sc.nextInt();
                    ps = con.prepareStatement("update student set address=?, contact=?, sem=? where Sno=?");
                    ps.setString(1, address1);
                    ps.setInt(2, contact1);
                    ps.setInt(3, sem1);
                    ps.setInt(4, Sno1);
                    int j = ps.executeUpdate();
                    if (j > 0) {
                        System.out.println("Record updated successfully");
                    } else {
                        System.out.println("Record not updated");
                    }
                    break;
                case 3:
                    System.out.println("Enter Sno:");
                    int Sno2 = sc.nextInt();
                    ps = con.prepareStatement("select * from student where Sno=?");
                    ps.setInt(1, Sno2);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        System.out.println("Sno: " + rs.getInt(1));
                        System.out.println("rollno: " + rs.getInt(2));
                        System.out.println("name: " + rs.getString(3));
                        System.out.println("address: " + rs.getString(4));
                        System.out.println("contact: " + rs.getInt(5));
                        System.out.println("course: " + rs.getString(6));
                        System.out.println("sem: " + rs.getInt(7));
                    } else {
                        System.out.println("Record not found");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            if (con != null) {
                con.close();
            }
            if (st != null) {
                st.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        sc.close();
    }
}
