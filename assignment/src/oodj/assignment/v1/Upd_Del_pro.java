/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;

import Class.Fragile;
import Class.Non_fragile;
import Class.OrderItem;
import Class.Product;
import java.util.ArrayList;
import java.util.StringJoiner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jcgan
 */
public class Upd_Del_pro extends javax.swing.JFrame {

    /**
     * Creates new form Upd_Del_pro
     */
    public Upd_Del_pro() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        Product pdt = new Product();
        ArrayList<Object[]> al = pdt.view_product(model,"producttxt.txt");
        for(int i =0; al.size()>i;i++){
            model.addRow(al.get(i));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pdt_ctg_combox = new javax.swing.JComboBox<>();
        pdt_ctg_lab = new javax.swing.JLabel();
        price_txt = new javax.swing.JTextField();
        qty_txt = new javax.swing.JTextField();
        pdt_name_txt = new javax.swing.JTextField();
        cal_final_price_but = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        final_price_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        final_price_lab = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pdt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Update & Delete Product");

        pdt_ctg_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-fragile", "Fragile" }));
        pdt_ctg_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdt_ctg_comboxActionPerformed(evt);
            }
        });

        pdt_ctg_lab.setText("Product Category:");

        price_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_txtActionPerformed(evt);
            }
        });

        cal_final_price_but.setText("Calculate Final Price");
        cal_final_price_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal_final_price_butActionPerformed(evt);
            }
        });

        jLabel3.setText("Price:");

        final_price_txt.setEditable(false);
        final_price_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_price_txtActionPerformed(evt);
            }
        });
        final_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                final_price_txtKeyTyped(evt);
            }
        });

        jLabel2.setText("Quantity:");

        final_price_lab.setText("Final Price:");

        jLabel4.setText("Product Name:");

        jLabel6.setText("*fragile product cost 10% of original price for bundling charge.");

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Product Name", "Product Quantity", "Product Price", "Product Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel7.setText("*non-fragile product cost 5% of original price for bundling charge.");

        jLabel5.setText("Product ID:");

        pdt_id.setEditable(false);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh Table");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(300, 300, 300)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(qty_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pdt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(price_txt)
                                            .addComponent(pdt_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pdt_ctg_lab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(final_price_lab, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(final_price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cal_final_price_but))
                                    .addComponent(pdt_ctg_combox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pdt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pdt_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qty_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdt_ctg_lab)
                            .addComponent(pdt_ctg_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(final_price_lab)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(final_price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cal_final_price_but)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pdt_ctg_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdt_ctg_comboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdt_ctg_comboxActionPerformed

    private void price_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_txtActionPerformed

    }//GEN-LAST:event_price_txtActionPerformed

    private void cal_final_price_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal_final_price_butActionPerformed

        double pdt_Price = Double.parseDouble(price_txt.getText());
        String pdt_Ctgy = (String)pdt_ctg_combox.getSelectedItem();
        if (pdt_Ctgy == "Fragile"){
            Fragile fra = new Fragile();
            double final_price = fra.calculate_fragile_price(pdt_Price, pdt_Ctgy);
            final_price_txt.setText(String.valueOf(final_price));
        }
        else if(pdt_Ctgy == "Non-fragile"){
            Non_fragile nonfra = new Non_fragile();
            double final_price = nonfra.calculate_nonfragile_price(pdt_Price, pdt_Ctgy);
            final_price_txt.setText(String.valueOf(final_price));
        }
    }//GEN-LAST:event_cal_final_price_butActionPerformed

    private void final_price_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_price_txtActionPerformed
        /*
        Product pdt = new Product();
        double pdt_Price = Double.parseDouble(price_txt.getText());
        String pdt_Ctgy = (String)pdt_ctg_combox.getSelectedItem();
        DocumentListener finalpriceListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                final_price_calculation();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                final_price_calculation();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                final_price_calculation();
            }
            public void final_price_calculation(){
                try{
                    double pdt_Price = Double.parseDouble(price_txt.getText());
                    double final_price = 0;

                    if (pdt_Ctgy == "Non-fragile"){
                        final_price = pdt_Price + (pdt_Price * 0.05);
                    }
                    else if (pdt_Ctgy == "Fragile")
                    final_price = pdt_Price + (pdt_Price * 0.1);

                    System.out.println(final_price);

                    final_price_txt.setText(String.valueOf(final_price));

                }catch (NumberFormatException nfe){
                    System.out.println("Invalid number(s) provided");
                }
            }
        };
        price_txt.getDocument().addDocumentListener(finalpriceListener);
        */
    }//GEN-LAST:event_final_price_txtActionPerformed

    private void final_price_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_final_price_txtKeyTyped

    }//GEN-LAST:event_final_price_txtKeyTyped

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int selectedRowIndex = ProductTable.getSelectedRow();
        
        pdt_id.setText(model.getValueAt(selectedRowIndex, 0).toString());
        pdt_name_txt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        qty_txt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        price_txt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        pdt_ctg_combox.setSelectedItem(model.getValueAt(selectedRowIndex, 4).toString());
        
       
        
        
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double final_Price;
        try{
            final_Price = Double.parseDouble(final_price_txt.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please calculate final price!");
        }
        try{
            
            String pdt_ID = pdt_id.getText();
            String pdt_Name = pdt_name_txt.getText();
            int pdt_Qtt = Integer.parseInt(qty_txt.getText());
            double pdt_final_Price = Double.parseDouble(final_price_txt.getText());
            String pdt_Ctgy = (String)pdt_ctg_combox.getSelectedItem();
            Product pdt = new Product();
            pdt.update_product(pdt_ID, pdt_Name, pdt_Qtt, pdt_final_Price, pdt_Ctgy);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please fill the neccessary fields!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            model.setRowCount(0);}
        catch(Exception e){}
        
        try{
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            Product pdt = new Product();
            ArrayList<Object[]> al = pdt.view_product(model,"producttxt.txt");
            for(int i =0; al.size()>i;i++){
                model.addRow(al.get(i));
            }
            
            
            
        }catch(Exception e){}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Mng_pdt mp = new Mng_pdt();
       mp.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Product pdt = new Product();
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int SelectedRow = ProductTable.getSelectedRow();
        model.removeRow(SelectedRow);
        
            try {
                String pdt_ID = pdt_id.getText();
                pdt.delete_product(pdt_ID);
                //oi.delete_order_item(pdt_ID);
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
            java.util.logging.Logger.getLogger(Upd_Del_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upd_Del_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upd_Del_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upd_Del_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upd_Del_pro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable ProductTable;
    private javax.swing.JButton cal_final_price_but;
    private javax.swing.JLabel final_price_lab;
    private javax.swing.JTextField final_price_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pdt_ctg_combox;
    private javax.swing.JLabel pdt_ctg_lab;
    private javax.swing.JTextField pdt_id;
    private javax.swing.JTextField pdt_name_txt;
    private javax.swing.JTextField price_txt;
    private javax.swing.JTextField qty_txt;
    // End of variables declaration//GEN-END:variables
}