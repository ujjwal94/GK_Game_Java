
package javaapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class SQLconn 
{
    Connection conn=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","hr");
            
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
