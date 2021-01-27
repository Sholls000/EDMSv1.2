
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abubakar Emmanuel
 */
public class DBConnection {
      private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connection successful");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("connection failed" + cnfe);
        }
          String url = "jdbc:mysql://localhost/employee_db";
          try {
              DBConnection = (Connection) DriverManager.getConnection(url, "root", "jesus");
              System.out.println("database connected");
          }
        catch (SQLException se){
            System.out.println("no database" + se);
        }
          return DBConnection;
    }
    
    
}
