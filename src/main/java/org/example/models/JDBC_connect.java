package org.example.models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_connect {
    public static void main(String[] args) throws Exception {
        int age = 20;
        int grade = 12;
        String name = "Sita";
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Jar files already added from the project structure
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        //PreparedStatement ps = con.prepareStatement("insert into students(Age, Name,Class) value('"+age+"','"+name+"','"+grade+"')");
        PreparedStatement ps = con.prepareStatement("insert into students(Age, Name,Class) value(?,?,?)");
        ps.setInt(1,age);
        ps.setString(2,name);
        ps.setInt(3,grade);


        int i = ps.executeUpdate();

        if(i>0){
            System.out.println("Value Inserted!!");
        }else{
            System.out.println("Insertion failed!");
        }

    }
}
