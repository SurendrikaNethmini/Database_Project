package Project;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Nethmi
 */
public class ConnectionProvider {
    public static Connection con()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital management system","root","");
             
                       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e); 
        }
        return con; 
    }

   
}
