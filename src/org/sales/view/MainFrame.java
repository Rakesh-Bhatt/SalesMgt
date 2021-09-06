/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sales.view;

/**
 *
 * @author CIT
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Product = new javax.swing.JMenu();
        jMenuItem_AddProduct = new javax.swing.JMenuItem();
        jMenuItem_ViewPoduct = new javax.swing.JMenuItem();
        jMenu_Sales = new javax.swing.JMenu();
        jMenuItem_SellProduct = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu_Product.setText("Product");

        jMenuItem_AddProduct.setText("Add Product");
        jMenuItem_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddProductActionPerformed(evt);
            }
        });
        jMenu_Product.add(jMenuItem_AddProduct);

        jMenuItem_ViewPoduct.setText("View Product");
        jMenuItem_ViewPoduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ViewPoductActionPerformed(evt);
            }
        });
        jMenu_Product.add(jMenuItem_ViewPoduct);

        jMenuBar1.add(jMenu_Product);

        jMenu_Sales.setText("Sales");

        jMenuItem_SellProduct.setText("Sell Product");
        jMenuItem_SellProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SellProductActionPerformed(evt);
            }
        });
        jMenu_Sales.add(jMenuItem_SellProduct);

        jMenuBar1.add(jMenu_Sales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddProductActionPerformed
       AddProduct ob=new AddProduct();
       desktop.add(ob);
       ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AddProductActionPerformed

    private void jMenuItem_ViewPoductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ViewPoductActionPerformed
        ViewProduct ob=new ViewProduct();
       desktop.add(ob);
       ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ViewPoductActionPerformed

    private void jMenuItem_SellProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SellProductActionPerformed
        SellProduct ob=new SellProduct();
       desktop.add(ob);
       ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem_SellProductActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_AddProduct;
    private javax.swing.JMenuItem jMenuItem_SellProduct;
    private javax.swing.JMenuItem jMenuItem_ViewPoduct;
    private javax.swing.JMenu jMenu_Product;
    private javax.swing.JMenu jMenu_Sales;
    // End of variables declaration//GEN-END:variables
}