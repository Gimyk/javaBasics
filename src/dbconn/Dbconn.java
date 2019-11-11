package dbconn;

import java.sql.*;
import java.util.Scanner;

public class Dbconn {

    public static void db(String name, String pass) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");

            Statement stm = conn.createStatement();

//            String sql = "insert into users (name, password) values ('"+name+"','"+pass+"')";
            // "insert into users (name, password) values ('John', 'password1')"
//            stm.executeUpdate(sql);
            String sql = "insert into users (name, password) values (?,?)";
            PreparedStatement prp = conn.prepareStatement(sql);

            prp.setString(1, name);
            prp.setString(2, pass);
            
            prp.execute();

//            Fetching data from the database
            ResultSet rs = stm.executeQuery("select * from users");

            // iterate through the results.
            while (rs.next()) {
                System.out.println("The name = > " + rs.getString("name"));
                System.out.println("The pass = > " + rs.getString("password"));
            }
            conn.close();
        } catch (Exception exc) {
            System.out.println("Error: " + exc);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter username: ");
        String name = inp.next();
        System.out.print("Please enter password: ");
        String pass = inp.next();

        db(name, pass);
    }

}

//to runn in the msql client(either phpMyAdmin or comand line interface)
//create database login;
//use login;
//create table users(
//    id int(11) AUTO_INCREMENT PRIMARY KEY,
//    name varchar(100) not null,
//    password varchar(100)
//);
//insert into users (name, password) values('Jane', 'pass123');
