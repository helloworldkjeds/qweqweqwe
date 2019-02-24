/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;

import Class.Customer;
import Class.OrderItem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author New
 */
public class CheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
        initComponents();
        
        Customer cus = new Customer();
        boolean checkorder = cus.select_cus_id();
        if (!checkorder){
            JOptionPane.showMessageDialog(null,"You have not order any product!");
        }else{
            DefaultTableModel model = (DefaultTableModel) OrderItemTable.getModel();
            OrderItem odr = new OrderItem();
            ArrayList<Object[]> al = odr.view_cart_item(model, "cartitemtxt.txt");
            for(int i =0; al.size()>i;i++){
                model.addRow(al.get(i));
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderItemTable = new javax.swing.JTable();
        back_but = new javax.swing.JButton();
        check_out_but = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CheckOut");

        OrderItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Product ID", "Product Name", "Product Quantity", "Unit Price", "Sub Total", "Product Category"
            }
        ));
        jScrollPane2.setViewportView(OrderItemTable);

        back_but.setText("Back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        check_out_but.setText("CheckOut");
        check_out_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_out_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_out_but, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(check_out_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back_but, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
            Mng_odr_cus mos = new Mng_odr_cus();
            mos.setVisible(true) ;
            this.setVisible(false);
    }//GEN-LAST:event_back_butActionPerformed

    private void check_out_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_out_butActionPerformed
        OrderItem oi = new OrderItem();
        int order_id = oi.new_order_id();
        DefaultTableModel model = (DefaultTableModel) OrderItemTable.getModel();
        int total_item_qtt = OrderItemTable.getRowCount();
        for (int i=0; i<OrderItemTable.getRowCount(); i++){
            String cus_ID=model.getValueAt(i, 0).toString();
            String pdt_ID=model.getValueAt(i, 1).toString();
            String pdt_Name=model.getValueAt(i, 2).toString();
            int pdt_Qtt=Integer.parseInt(model.getValueAt(i, 3).toString());
            double pdt_Price=Double.parseDouble(model.getValueAt(i,4).toString());
            double total_Price=Double.parseDouble(model.getValueAt(i, 5).toString());
            String pdt_Ctgy = model.getValueAt(i, 6).toString();
            try {
                oi.insert_into_orderitem(order_id,cus_ID,pdt_ID, pdt_Name, pdt_Price, total_Price, pdt_Qtt,pdt_Ctgy);
                System.out.println(order_id);
            } catch (IOException ex) {
                Logger.getLogger(OrderItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        /*
        try{
                odr.insert_order(order_id, cus_ID, total_item_qtt, total_Price);
            } catch (IOException ex) {
                Logger.getLogger(OrderItem.class.getName()).log(Level.SEVERE, null, ex);
            }    
            JOptionPane.showMessageDialog(null,"Successfully Create Order.");
        }
        */
        
        }
        
    }//GEN-LAST:event_check_out_butActionPerformed
    
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderItemTable;
    private javax.swing.JButton back_but;
    private javax.swing.JButton check_out_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
