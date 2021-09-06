
package org.sales.controller;

import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.sales.model.Sales;
import org.sales.util.DBConnection;


public class SalesDAO {
    public void saveData(List<Sales> list)
    {
        Connection con=null;
        try
        {
          con=DBConnection.getConnection();
          con.setAutoCommit(false);
          for(int i=0;i<list.size();i++)
          {
              String sql="insert into sales(pid,sid,qty,dos) values(?,?,?,?)";
              PreparedStatement pst=con.prepareStatement(sql);
              pst.setInt(1,list.get(i).getPid());
              pst.setInt(2,list.get(i).getSid());
              pst.setInt(3,list.get(i).getQty());
              pst.setDate(4,new java.sql.Date(list.get(i).getDos().getTime()));
              pst.execute();
              
              ProductDAO pdc=new ProductDAO();
              int qty=pdc.getQty(list.get(i).getPid(),con);
              
              
                    //update stock quantity of the stock  
                      int newQty=qty-list.get(i).getQty();
                      pdc.updateQty(list.get(i).getPid(),newQty,con);
                      JOptionPane.showMessageDialog(null,"record updated");
                      con.commit();
          }
        }catch(Exception ex)
        {
            System.out.println(ex);
            try
            {
                con.rollback();
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        finally
        {
            try
            {
                con.close();
                
            }catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
    }
    
}
