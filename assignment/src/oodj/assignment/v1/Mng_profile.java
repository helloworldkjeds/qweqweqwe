/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;

import Class.Admin;
import Class.StaticClass;
import Class.Customer;
import Class.User;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author New
 */
public class Mng_profile extends javax.swing.JFrame {

    /**
     * Creates new form Mng_profile
     */
    
    
    
     
    
    public Mng_profile() { 
        initComponents();
        StaticClass Sc = new StaticClass();
        if (Sc.Position == "Admin"){
            Admin admin = new Admin();
            id_txt.setText(admin.get_id_no());
            email_txt.setText(admin.get_email());
            firstname_txt.setText(admin.get_firstname());
            lastname_txt.setText(admin.get_lastname());
            contact_no_txt.setText(String.valueOf(admin.get_contact_no()));
            addr_txt.setText(admin.get_address());
            pwd_txt.setText(admin.get_pwd());
            crm_pwd_txt.setText(admin.get_pwd());
        }
        else if (Sc.Position == "Customer"){
            Customer cus = new Customer();
            id_txt.setText(cus.get_id_no());
            email_txt.setText(cus.get_email());
            firstname_txt.setText(cus.get_firstname());
            lastname_txt.setText(cus.get_lastname());
            contact_no_txt.setText(String.valueOf(cus.get_contact_no()));
            addr_txt.setText(cus.get_address());
            pwd_txt.setText(cus.get_pwd());
            crm_pwd_txt.setText(cus.get_pwd());
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

        addr_lab = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addr_txt = new javax.swing.JTextArea();
        contact_no = new javax.swing.JLabel();
        contact_no_txt = new javax.swing.JTextField();
        lastname_lab = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JTextField();
        firstname_lab = new javax.swing.JLabel();
        firstname_txt = new javax.swing.JTextField();
        email_lab = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        pwd_lab = new javax.swing.JLabel();
        pwd_txt = new javax.swing.JPasswordField();
        crm_pwd_lab = new javax.swing.JLabel();
        crm_pwd_txt = new javax.swing.JPasswordField();
        update_but = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back_but = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addr_lab.setText("Address:");

        addr_txt.setColumns(20);
        addr_txt.setRows(5);
        jScrollPane2.setViewportView(addr_txt);

        contact_no.setText("Contact number:");

        contact_no_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_no_txtActionPerformed(evt);
            }
        });

        lastname_lab.setText("Last Name:");

        lastname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname_txtActionPerformed(evt);
            }
        });

        firstname_lab.setText("First Name:");

        firstname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname_txtActionPerformed(evt);
            }
        });

        email_lab.setText("Email:");

        email_txt.setEditable(false);

        pwd_lab.setText("Password:");

        crm_pwd_lab.setText("Confirm Password:");

        update_but.setText("Update");
        update_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_butActionPerformed(evt);
            }
        });

        jLabel1.setText("Manage Profile");

        back_but.setText("Back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        id_txt.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(update_but, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(crm_pwd_lab)
                                .addGap(32, 32, 32)
                                .addComponent(crm_pwd_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pwd_lab)
                                .addGap(80, 80, 80)
                                .addComponent(pwd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contact_no_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contact_no)
                                    .addComponent(addr_lab)
                                    .addComponent(email_lab)
                                    .addComponent(firstname_lab)
                                    .addComponent(lastname_lab)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(email_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstname_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastname_txt)
                                    .addComponent(id_txt))))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_lab)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_lab)
                    .addComponent(firstname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname_lab))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact_no)
                    .addComponent(contact_no_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addr_lab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd_lab)
                    .addComponent(pwd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crm_pwd_lab)
                    .addComponent(crm_pwd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_but, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contact_no_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_no_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_no_txtActionPerformed

    private void lastname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname_txtActionPerformed

    }//GEN-LAST:event_lastname_txtActionPerformed

    private void firstname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname_txtActionPerformed

    }//GEN-LAST:event_firstname_txtActionPerformed

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        StaticClass Sc = new StaticClass();
        if (Sc.Position == "Admin"){
            Admin_Menu am = new Admin_Menu();
            am.setVisible(true);
            this.setVisible(false);}
        else if (Sc.Position =="Customer"){
            Cus_Menu cus = new Cus_Menu();
            cus.setVisible(true);
            this.setVisible(false);}
    
        
    }//GEN-LAST:event_back_butActionPerformed

    private void update_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_butActionPerformed
        Admin admin = new Admin();
        Customer cus = new Customer();
        String Email = email_txt.getText();
        String Newfirstname = firstname_txt.getText();      
        String Newlastname = lastname_txt.getText();
        String Newaddress = addr_txt.getText();
        
        int Newcontact_no = Integer.parseInt(contact_no_txt.getText());
        
        try 
        {
            Newcontact_no = Integer.parseInt(contact_no_txt.getText());

        }  
        catch (Exception e) 
        {
                JOptionPane.showMessageDialog(this, "Contact number is compulsory and must be INTEGER! Please type again...",
                        "Error: Contact number", JOptionPane.ERROR_MESSAGE);
                contact_no_txt.setText("");

        }
        
        char[] pwd = pwd_txt.getPassword();
        char[] crm_pwd = crm_pwd_txt.getPassword();
        StaticClass Sc = new StaticClass();
        if(Arrays.equals(pwd, crm_pwd)){ //passwords is matched
            String formattedString_password = Arrays.toString(pwd)
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the open bracket
                    .replace("]", "")  //remove the close bracket
                    .replace(" ", "") //remove the spacebar
                    .trim();
            String Newpassword = formattedString_password;
            if (Sc.Position == "Admin"){
                admin.upd_profile(Email,Newpassword, Newfirstname, Newlastname, Newcontact_no, Newaddress);
            }
            else if (Sc.Position == "Customer"){
                cus.upd_profile(Email,Newpassword, Newfirstname, Newlastname, Newcontact_no, Newaddress);
                
            }
        }
        else{
            //passwords are not matched
            JOptionPane.showMessageDialog(null,"Please make sure your passwords are matched!");
            pwd_txt.setText("");
            crm_pwd_txt.setText("");     
        }    
        /*
        String Newpassword = 
        
        admin.upd_profile(Newpassword, Newfirstname, Newlastname, Newcontact, Newaddress);
        */
    }//GEN-LAST:event_update_butActionPerformed

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
            java.util.logging.Logger.getLogger(Mng_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mng_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mng_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mng_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mng_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addr_lab;
    private javax.swing.JTextArea addr_txt;
    private javax.swing.JButton back_but;
    private javax.swing.JLabel contact_no;
    private javax.swing.JTextField contact_no_txt;
    private javax.swing.JLabel crm_pwd_lab;
    private javax.swing.JPasswordField crm_pwd_txt;
    private javax.swing.JLabel email_lab;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel firstname_lab;
    private javax.swing.JTextField firstname_txt;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastname_lab;
    private javax.swing.JTextField lastname_txt;
    private javax.swing.JLabel pwd_lab;
    private javax.swing.JPasswordField pwd_txt;
    private javax.swing.JButton update_but;
    // End of variables declaration//GEN-END:variables
}
