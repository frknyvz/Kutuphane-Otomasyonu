/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oguzhan
 */
import java.sql.*;
import javax.swing.JOptionPane;
    public class DatabaseManager {
    Connection connection;
    static private String userName="root";
    static private String password="";
    static private String dbUrl="jdbc:mysql://localhost:3306/library?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
   public static Connection getConnection(){
      try{
         
           Connection connection=DriverManager.getConnection(dbUrl, userName,password);
          return connection;
      }
     catch(Exception exception){ 
        JOptionPane.showMessageDialog(null, exception);
        return null;
     }
         
  }

    void showErrorMessage(SQLException exception) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
