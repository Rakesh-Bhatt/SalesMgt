
package org.sales.controller;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.sales.model.Login;
//import org.sales.model.Product;
import org.sales.util.DBConnection;
import java.sql.*;

public class LoginDAO {
    
    public int verifyUser(Login ob)
    {
        
       int count=0; 
       try
        {
           Connection con=DBConnection.getConnection();
           String sql="select * from login where username=? and password=?";
           PreparedStatement st=con.prepareStatement(sql);
           st.setString(1, ob.getUsername());
           st.setString(2,ob.getPassword());
           ResultSet rs=st.executeQuery();
           if(rs.next())
           { 
               
             count=rs.getInt("id");
           }
                      
          con.close();
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
            
        }
        return count;
    }
}
