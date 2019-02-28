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
public class ViewOrder extends javax.swing.JFrame {
    int order_id;
    /**
     * Creates new form ViewOrder
     */
    public ViewOrder() {
        initComponents();
        Customer cus = new Customer();
        OrderItem oi = new OrderItem();
        boolean checkorder = cus.order_select_cus_id();
        if (!checkorder){
            JOptionPane.showMessageDialog(null,"You have not ordered any product!");
        }else{
            DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
            
            ArrayList<Object[]> al = cus.view_order(cus.get_id_no(), model, "ordertxt.txt");
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

        back_but = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderItemTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        odr_itemtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cus_idtxt = new javax.swing.JTextField();
        pdt_id_lab = new javax.swing.JLabel();
        productid_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pdt_name_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pdt_qtt_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pdt_prc_txt = new javax.swing.JTextField();
        pdt_ctg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ttl_pricetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_but.setText("Back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

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

        jLabel1.setText("OrderItem ID:");

        odr_itemtxt.setEditable(false);

        jLabel7.setText("Customer ID:");

        cus_idtxt.setEditable(false);

        pdt_id_lab.setText("Product ID:");

        productid_txt.setEditable(false);
        productid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productid_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        pdt_name_txt.setEditable(false);

        jLabel3.setText("Product Quantity:");

        pdt_qtt_txt.setEditable(false);

        jLabel4.setText("Product Price:");

        pdt_prc_txt.setEditable(false);

        pdt_ctg.setEditable(false);

        jLabel5.setText("Product Category:");

        jLabel6.setText("Total Price:");

        ttl_pricetxt.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(pdt_id_lab)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productid_txt)
                            .addComponent(pdt_name_txt)
                            .addComponent(pdt_qtt_txt)
                            .addComponent(pdt_prc_txt)
                            .addComponent(pdt_ctg)
                            .addComponent(ttl_pricetxt)
                            .addComponent(odr_itemtxt)
                            .addComponent(cus_idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(odr_itemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pdt_ctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttl_pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        Mng_odr_cus moc = new Mng_odr_cus();
        moc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_butActionPerformed

    private void OrderItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemTableMouseClicked

    }//GEN-LAST:event_OrderItemTableMouseClicked

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        

    }//GEN-LAST:event_OrderTableMouseClicked

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
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderItemTable;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton back_but;
    private javax.swing.JTextField cus_idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField odr_itemtxt;
    private javax.swing.JTextField pdt_ctg;
    private javax.swing.JLabel pdt_id_lab;
    private javax.swing.JTextField pdt_name_txt;
    private javax.swing.JTextField pdt_prc_txt;
    private javax.swing.JTextField pdt_qtt_txt;
    private javax.swing.JTextField productid_txt;
    private javax.swing.JTextField ttl_pricetxt;
    // End of variables declaration//GEN-END:variables
}
