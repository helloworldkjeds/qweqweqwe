/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;

import Class.Customer;
import Class.Order;
import Class.OrderItem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author New
 */
public class DisplayBill extends javax.swing.JFrame {
    int order_id;
    /**
     * Creates new form DisplayBill
     */
    public DisplayBill() {
        initComponents();
        Customer cus = new Customer();
        Order odr = new Order();
        boolean checkorder = cus.order_select_cus_id();
        if (!checkorder){
            JOptionPane.showMessageDialog(null,"You have not ordered any product!");
        }else{
            DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
            
            ArrayList<Object[]> al = odr.view_bill(cus.get_id_no(), model, "ordertxt.txt");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderItemTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        back_but = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        productid_txt = new javax.swing.JTextField();
        pdt_id_lab = new javax.swing.JLabel();
        ttl_pricetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        odr_itemtxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pdt_ctg = new javax.swing.JTextField();
        pdt_prc_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pdt_qtt_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pdt_name_txt = new javax.swing.JTextField();
        cusid_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ttl_qtt_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        grand_tll_txt = new javax.swing.JTextField();
        odr_status_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Total Quantity", "Grand Total", "Order Status"
            }
        ));
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderTable);

        OrderItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product ID", "Product Name", "Unit Price", "Sub Total", "Product Quantity", "Product Category"
            }
        ));
        OrderItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(OrderItemTable);

        jLabel7.setText("Customer ID:");

        back_but.setText("Back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        productid_txt.setEditable(false);
        productid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productid_txtActionPerformed(evt);
            }
        });

        pdt_id_lab.setText("Product ID:");

        ttl_pricetxt.setEditable(false);

        jLabel6.setText("Subtotal");

        odr_itemtxt1.setEditable(false);

        jLabel8.setText("Order ID:");

        jLabel5.setText("Product Category:");

        pdt_ctg.setEditable(false);

        pdt_prc_txt.setEditable(false);

        jLabel4.setText("Product Price:");

        pdt_qtt_txt.setEditable(false);

        jLabel3.setText("Product Quantity:");

        pdt_name_txt.setEditable(false);

        jLabel1.setText("Total Quantity");

        jLabel9.setText("Grand Total:");

        jLabel10.setText("Order Status:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Display Bill");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel12.setText("Bill Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel3)
                                        .addComponent(pdt_id_lab))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(productid_txt)
                                        .addComponent(pdt_name_txt)
                                        .addComponent(pdt_qtt_txt)
                                        .addComponent(pdt_prc_txt)
                                        .addComponent(ttl_pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(pdt_ctg, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(odr_itemtxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addComponent(cusid_txt)
                                        .addComponent(ttl_qtt_txt)
                                        .addComponent(grand_tll_txt)
                                        .addComponent(odr_status_txt))))))
                    .addComponent(jLabel11))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(odr_itemtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cusid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ttl_qtt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(grand_tll_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(odr_status_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdt_id_lab)
                            .addComponent(productid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pdt_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pdt_prc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttl_pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(pdt_qtt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pdt_ctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        int selectedRowIndex = OrderTable.getSelectedRow();
        Order odr = new Order();
        order_id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        odr_itemtxt1.setText( model.getValueAt(selectedRowIndex, 0).toString());
        cusid_txt.setText( model.getValueAt(selectedRowIndex, 1).toString());
        ttl_qtt_txt.setText( model.getValueAt(selectedRowIndex, 2).toString());
        grand_tll_txt.setText( model.getValueAt(selectedRowIndex, 3).toString());
        odr_status_txt.setText( model.getValueAt(selectedRowIndex, 4).toString());
        select_order_item();
        
    }//GEN-LAST:event_OrderTableMouseClicked
    
    public void select_order_item(){
        OrderItem oi = new OrderItem();
        
        DefaultTableModel model_2 = (DefaultTableModel) OrderItemTable.getModel();
        model_2.setRowCount(0);
        ArrayList<Object[]> array = oi.view_order_item(order_id,model_2,"orderitemtxt.txt");
        for(int i =0; array.size()>i;i++){
            model_2.addRow(array.get(i));
            
        }
        System.out.println(order_id);
    }    
    
    private void OrderItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemTableMouseClicked
        DefaultTableModel model_2 = (DefaultTableModel) OrderItemTable.getModel();
        
        int selectedRowIndex = OrderItemTable.getSelectedRow();
       
        
        productid_txt.setText(model_2.getValueAt(selectedRowIndex, 1).toString());
        pdt_name_txt.setText(model_2.getValueAt(selectedRowIndex, 2).toString());
        pdt_prc_txt.setText(model_2.getValueAt(selectedRowIndex, 3).toString());
        ttl_pricetxt.setText(model_2.getValueAt(selectedRowIndex, 4).toString());
        pdt_qtt_txt.setText(model_2.getValueAt(selectedRowIndex, 5).toString());
        pdt_ctg.setText(model_2.getValueAt(selectedRowIndex, 6).toString());
    }//GEN-LAST:event_OrderItemTableMouseClicked

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        Cus_Menu cm = new Cus_Menu();
        cm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_butActionPerformed

    private void productid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productid_txtActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderItemTable;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton back_but;
    private javax.swing.JTextField cusid_txt;
    private javax.swing.JTextField grand_tll_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField odr_itemtxt1;
    private javax.swing.JTextField odr_status_txt;
    private javax.swing.JTextField pdt_ctg;
    private javax.swing.JLabel pdt_id_lab;
    private javax.swing.JTextField pdt_name_txt;
    private javax.swing.JTextField pdt_prc_txt;
    private javax.swing.JTextField pdt_qtt_txt;
    private javax.swing.JTextField productid_txt;
    private javax.swing.JTextField ttl_pricetxt;
    private javax.swing.JTextField ttl_qtt_txt;
    // End of variables declaration//GEN-END:variables
}
