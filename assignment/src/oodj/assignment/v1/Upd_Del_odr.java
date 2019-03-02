/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;

import Class.Customer;
import Class.OrderItem;
import Class.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author New
 */
public class Upd_Del_odr extends javax.swing.JFrame {

    /**
     * Creates new form Upd_Del_odr
     */
    public Upd_Del_odr() {
        initComponents();
        
        
        Customer cus = new Customer();
        

        
        boolean checkorder = cus.cart_select_cus_id();
        if (!checkorder){
            JOptionPane.showMessageDialog(null,"You have not ordered any product!");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        OrderItemTable = new javax.swing.JTable();
        show_odr_item_but = new javax.swing.JButton();
        edit_odr_item = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pdt_name_txt = new javax.swing.JTextField();
        pdt_qtt_txt = new javax.swing.JTextField();
        pdt_prc_txt = new javax.swing.JTextField();
        pdt_ctg = new javax.swing.JTextField();
        ttl_pricetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cal_ttl_price_but = new javax.swing.JButton();
        pdt_id_lab = new javax.swing.JLabel();
        productid_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cus_idtxt = new javax.swing.JTextField();
        back_but = new javax.swing.JButton();
        odr_qtt_txt = new javax.swing.JTextField();
        odr_qttlab1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        crr_tll_prctxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OrderItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Product ID", "Product Name", "Product Quantity", "Unit Price", "SubTotal", "Product Category"
            }
        ));
        OrderItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(OrderItemTable);
        if (OrderItemTable.getColumnModel().getColumnCount() > 0) {
            OrderItemTable.getColumnModel().getColumn(0).setResizable(false);
        }

        show_odr_item_but.setText("Refresh Table");
        show_odr_item_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_odr_item_butActionPerformed(evt);
            }
        });

        edit_odr_item.setText("Update/Edit Order Item");
        edit_odr_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_odr_itemActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Order Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pdt_name_txt.setEditable(false);

        pdt_qtt_txt.setEditable(false);

        pdt_prc_txt.setEditable(false);

        pdt_ctg.setEditable(false);

        ttl_pricetxt.setEditable(false);

        jLabel6.setText("New SubTotal:");

        cal_ttl_price_but.setText("Calculate Total Price");
        cal_ttl_price_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal_ttl_price_butActionPerformed(evt);
            }
        });

        pdt_id_lab.setText("Product ID:");

        productid_txt.setEditable(false);
        productid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productid_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        jLabel3.setText("Product Quantity:");

        jLabel4.setText("Product Price:");

        jLabel5.setText("Product Category:");

        jLabel7.setText("Customer ID:");

        cus_idtxt.setEditable(false);

        back_but.setText("Back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        odr_qttlab1.setText("Order Quantity:");

        jLabel1.setText("Current SubTotal:");

        crr_tll_prctxt.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Update & Delete Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(show_odr_item_but, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edit_odr_item, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(pdt_id_lab)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(odr_qttlab1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productid_txt)
                                    .addComponent(pdt_name_txt)
                                    .addComponent(pdt_qtt_txt)
                                    .addComponent(pdt_prc_txt)
                                    .addComponent(pdt_ctg)
                                    .addComponent(ttl_pricetxt)
                                    .addComponent(cus_idtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(odr_qtt_txt)
                                    .addComponent(cal_ttl_price_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crr_tll_prctxt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cus_idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdt_id_lab)
                            .addComponent(productid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pdt_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pdt_qtt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pdt_prc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(crr_tll_prctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pdt_ctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odr_qttlab1)
                            .addComponent(odr_qtt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ttl_pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cal_ttl_price_but, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_odr_item, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_odr_item_but, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cal_ttl_price_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal_ttl_price_butActionPerformed
         try{
            int odr_Qtt = Integer.parseInt(odr_qtt_txt.getText());
            Product pdt = new Product();
            double pdt_Price = Double.parseDouble(pdt_prc_txt.getText());
            
           
            
            double total_price = pdt.calculate_total_price(pdt_Price, odr_Qtt);
            ttl_pricetxt.setText(String.valueOf(total_price));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter quantity of product to order!");
        }
    }//GEN-LAST:event_cal_ttl_price_butActionPerformed

    private void productid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productid_txtActionPerformed

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        Mng_odr_cus moc = new Mng_odr_cus();
        moc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_butActionPerformed

    private void show_odr_item_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_odr_item_butActionPerformed
        try{DefaultTableModel model = (DefaultTableModel) OrderItemTable.getModel();
        model.setRowCount(0);}catch(Exception e){}
        
        try{DefaultTableModel model = (DefaultTableModel) OrderItemTable.getModel();
            OrderItem odr = new OrderItem();
            ArrayList<Object[]> al = odr.view_cart_item(model, "cartitemtxt.txt");
            for(int i =0; al.size()>i;i++){
                model.addRow(al.get(i));
            }}catch(Exception e){}
        
        
    }//GEN-LAST:event_show_odr_item_butActionPerformed

    private void OrderItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)OrderItemTable.getModel();
        int selectedRowIndex = OrderItemTable.getSelectedRow();
        
        cus_idtxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        productid_txt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        pdt_name_txt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        pdt_qtt_txt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        pdt_prc_txt.setText(model.getValueAt(selectedRowIndex, 4).toString());
        crr_tll_prctxt.setText(model.getValueAt(selectedRowIndex, 5).toString());
        pdt_ctg.setText(model.getValueAt(selectedRowIndex, 6).toString());
        ttl_pricetxt.setText(String.valueOf(""));    
    }//GEN-LAST:event_OrderItemTableMouseClicked

    private void edit_odr_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_odr_itemActionPerformed
        double total_Price;
        try{
            total_Price = Double.parseDouble(ttl_pricetxt.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please calculate total price!");
        }
        try{
            OrderItem oi = new OrderItem();
            String cus_ID = cus_idtxt.getText();
            String pdt_ID = productid_txt.getText();
            String pdt_Name = pdt_name_txt.getText();
            double unit_Price = Double.parseDouble(pdt_prc_txt.getText());
            
            
            int odr_Qtt = Integer.parseInt(odr_qtt_txt.getText());
            total_Price = Double.parseDouble(ttl_pricetxt.getText());
            String pdt_Ctgy = pdt_ctg.getText();
            
            int pdt_Qtt = Integer.parseInt(pdt_qtt_txt.getText());
            if (odr_Qtt <= pdt_Qtt){
                oi.update_order_item(cus_ID, pdt_ID, pdt_Name, odr_Qtt, unit_Price,total_Price, pdt_Ctgy);
                
                int pdt_left = pdt_Qtt - odr_Qtt;
            }
            else{
                 JOptionPane.showMessageDialog(null,"Insufficient product for purchase!");
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_edit_odr_itemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OrderItem oi = new OrderItem();
        DefaultTableModel model = (DefaultTableModel) OrderItemTable.getModel();
        int SelectedRow = OrderItemTable.getSelectedRow();
        model.removeRow(SelectedRow);
        
            try {
                String pdt_ID = productid_txt.getText();
                oi.delete_order_item(pdt_ID);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Delete fail!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Upd_Del_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upd_Del_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upd_Del_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upd_Del_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upd_Del_odr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderItemTable;
    private javax.swing.JButton back_but;
    private javax.swing.JButton cal_ttl_price_but;
    private javax.swing.JTextField crr_tll_prctxt;
    private javax.swing.JTextField cus_idtxt;
    private javax.swing.JButton edit_odr_item;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField odr_qtt_txt;
    private javax.swing.JLabel odr_qttlab1;
    private javax.swing.JTextField pdt_ctg;
    private javax.swing.JLabel pdt_id_lab;
    private javax.swing.JTextField pdt_name_txt;
    private javax.swing.JTextField pdt_prc_txt;
    private javax.swing.JTextField pdt_qtt_txt;
    private javax.swing.JTextField productid_txt;
    private javax.swing.JButton show_odr_item_but;
    private javax.swing.JTextField ttl_pricetxt;
    // End of variables declaration//GEN-END:variables
}
