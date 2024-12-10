package school.management.system;

import java.sql.*;

public class connection {
    
    Connection c;
    Statement s;

    connection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///schoolmanagementsystem", "root", "Sachin@#");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}