/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;


import Class.Admin;
import Class.User;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author New
 */
public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    
    
        
    public Login() {
        initComponents();
        
    }
    private static Scanner s;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_lab = new javax.swing.JLabel();
        email_lab = new javax.swing.JLabel();
        password_lab = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        pwd_txt = new javax.swing.JPasswordField();
        login_but = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        register_but = new javax.swing.JButton();
        positon_lab = new javax.swing.JLabel();
        pos_combox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_lab.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        login_lab.setText("Login");

        email_lab.setText("Email:");

        password_lab.setText("Password:");

        login_but.setText("Login");
        login_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_butActionPerformed(evt);
            }
        });

        jLabel1.setText("New user?");

        register_but.setText("Register");
        register_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_butActionPerformed(evt);
            }
        });

        positon_lab.setText("Login as?");

        pos_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));
        pos_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_comboxActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_lab)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(register_but)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_lab)
                                .addComponent(password_lab)
                                .addComponent(positon_lab))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(login_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pwd_txt)
                                .addComponent(email_txt)
                                .addComponent(pos_combox, 0, 250, Short.MAX_VALUE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(login_lab)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_lab)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_lab)
                    .addComponent(pwd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(positon_lab)
                        .addGap(34, 34, 34)
                        .addComponent(login_but)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(register_but)
                            .addComponent(jButton1))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pos_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void login_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_butActionPerformed
        
        String Email = email_txt.getText();
        char[] pwd = pwd_txt.getPassword();
        String formattedString_password = Arrays.toString(pwd)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the open bracket
                .replace("]", "")  //remove the close bracket
                .replace(" ", "") //remove the spacebar
                .trim();

        String Password = formattedString_password;
        String Position = (String)pos_combox.getSelectedItem();
        
        
        if(Password.length() == 0){
            JOptionPane.showMessageDialog(rootPane,"Please enter your password!");
        }
        else {
            User user = new User(Email,Password,Position);    
            boolean login = user.user_validate(Email,Password,Position);
            if (!login){
                JOptionPane.showMessageDialog(null,"Invalid login!");
            }else{
                JOptionPane.showMessageDialog(null,"You logged in as: " + Position);
                
                this.setVisible(false);
                
            }
            
        }
        /*
        else if (Position == "Customer"){
            JOptionPane.showMessageDialog(null,"You logged in as Customer.");
            Cus_Menu cus = new Cus_Menu();
            cus.setVisible(true);
            this.setVisible(false);
        }
        */
        
        
    }//GEN-LAST:event_login_butActionPerformed

    private void register_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_butActionPerformed
        Register reg = new Register();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_register_butActionPerformed

    private void pos_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_comboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pos_comboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Exit JVM
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
            
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email_lab;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_but;
    private javax.swing.JLabel login_lab;
    private javax.swing.JLabel password_lab;
    private javax.swing.JComboBox<String> pos_combox;
    private javax.swing.JLabel positon_lab;
    private javax.swing.JPasswordField pwd_txt;
    private javax.swing.JButton register_but;
    // End of variables declaration//GEN-END:variables
}
