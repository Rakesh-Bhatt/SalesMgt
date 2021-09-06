/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sales.view;

import java.util.*;
import javax.swing.table.DefaultTableModel;//for default table models
import org.sales.controller.ProductDAO;
import org.sales.controller.SalesDAO;
import org.sales.util.Global;
import org.sales.model.*;


public class SellProduct extends javax.swing.JInternalFrame {

    /**
     * Creates new form SellProduct
     */ DefaultTableModel model;
    public SellProduct() {
       
        initComponents();
        jLabel_CurrentDate.setText(new Date().toString());
        jLabel_User.setText(Global.user);
        
        //model
        model=new DefaultTableModel(null,new String []{"Id","Name","Price","Qty","Total"});
        jTable_Sales.setModel(model);
    }
    //for grant Total
    public void calculateTotal()
    {
        int rows =jTable_Sales.getRowCount();
        double gTotal=0.0;
        for(int i=0;i<rows;i++)
        {
            double total=Double.parseDouble(jTable_Sales.getValueAt(i,4).toString());
            gTotal+=total;
        }
        jLabel_Total.setText(gTotal+" ");
        
    }
    private void printBill()
    {
        int count =jTable_Sales.getRowCount();
        String str="Nameste Super market\n Newroad,Kathmandu\n";
        for(int i=0;i<count;i++)
        {
            str+=jTable_Sales.getValueAt(i,0).toString()+" ";
            str+=jTable_Sales.getValueAt(i,1).toString()+" ";
            str+=jTable_Sales.getValueAt(i,2).toString()+" ";
            str+=jTable_Sales.getValueAt(i,3).toString()+" ";
            str+=jTable_Sales.getValueAt(i,4).toString()+" \n";
        }
        str+="Grand Total: "+jLabel_Total.getText();
        str+="\n Thank You For ViSiting!!!";
        
        BillPrint ob=new BillPrint();
        ob.jTextArea_Bill.setLineWrap(true);
        ob.jTextArea_Bill.setText(str);
        try
        {
            ob.jTextArea_Bill.print();
                    
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_CurrentDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jButton_SavePrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel_Total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_User = new javax.swing.JLabel();
        jButton_Delete1 = new javax.swing.JButton();

        setClosable(true);

        jLabel_CurrentDate.setText("Current Date");

        jLabel1.setText("Id");

        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jButton_SavePrint.setText("Save & Print");
        jButton_SavePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SavePrintActionPerformed(evt);
            }
        });

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Sales);

        jButton1.setText("Grand Total");

        jLabel_Total.setText("Total");

        jLabel2.setText("Logged in as :");

        jLabel_User.setText("User");

        jButton_Delete1.setText("Delete");
        jButton_Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_CurrentDate)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addGap(65, 65, 65)
                .addComponent(jLabel_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_SavePrint)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Delete1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(74, 74, 74)
                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_CurrentDate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Delete1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel_Total))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_User)
                    .addComponent(jLabel2)
                    .addComponent(jButton_SavePrint))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        int id=Integer.parseInt(jTextField_Id.getText());
        ProductDAO pDAO=new ProductDAO();
        Product ob=pDAO.fetchData(id);
        if(ob.getId()>0)
            //when ID does not  matches the database Item in the Database
            
        {
        model.addRow(new Object[]{ob.getId(),ob.getName(),ob.getPrice(),"1",ob.getPrice()});
        //calling the total function
        calculateTotal();
        }
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jButton_Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete1ActionPerformed
        int row=jTable_Sales.getSelectedRow();
        model.removeRow(row);
        calculateTotal();
    }//GEN-LAST:event_jButton_Delete1ActionPerformed

    private void jButton_SavePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SavePrintActionPerformed
       List<Sales> list=new ArrayList();
       int count=jTable_Sales.getRowCount();
       for(int i=0;i<count;i++)
       {
           Sales ob=new Sales();
           int pid=Integer.parseInt(jTable_Sales.getValueAt(i,0).toString());
           int sid=Global.uid;
           int qty=Integer.parseInt(jTable_Sales.getValueAt(i,3).toString());
           java.util.Date d=new java.util.Date();
           
           ob.setPid(pid);
           ob.setSid(sid);
           ob.setQty(qty);
           ob.setDos(d);
           list.add(ob);
       }
       SalesDAO sDAO=new SalesDAO();
       sDAO.saveData(list);
      
       //for printing Bills
       printBill();
    }//GEN-LAST:event_jButton_SavePrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Delete1;
    private javax.swing.JButton jButton_SavePrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_CurrentDate;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Sales;
    private javax.swing.JTextField jTextField_Id;
    // End of variables declaration//GEN-END:variables
}
