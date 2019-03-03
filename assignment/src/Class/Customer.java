/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Class.User;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author New
 */
public class Customer extends User{
    public Customer(){}
    
    

    public String getAddress() {
        return address;
    }
    StaticClass Sc = new StaticClass();
    
    @Override
    public String get_id_no(){
        id_no = Sc.ID_no;
        return id_no;
    }
    
    @Override
    public void set_id_no(String id_no){
        this.id_no = id_no;
    }
    
    @Override
    public String get_email(){
        email = Sc.Email;
        return email;
    }
    
    @Override
    public void set_email(String email){
        this.email = email;
    }
    
    @Override
    public String get_pwd(){
        return Sc.Password;
    }
    //password mutator
    @Override
    public void set_pwd(String password){
        this.password = password;
    }
    
    @Override
    public String get_firstname(){
        return Sc.Firstname;
    }
   
    @Override
    public void set_firstname(String firstname){
        this.firstname = firstname;
    }
    
    @Override
    public String get_lastname(){
        return Sc.Lastname;
    }
    
    @Override
    public void set_lastname(String lastname){
        this.lastname = lastname;
    }
  
    
    @Override
    public int get_contact_no(){
        
        return Sc.Contactno;
    }
    
    
    @Override
    public void set_contact_no(int contact_no){
       
        this.contact_no = contact_no;
        
    }
    
    
    @Override
    public String get_address(){
        return Sc.Address;
    }
    
    //address mutator
    @Override
    public void set_address(String address){
        this.address = address;
    }
    
    @Override
    public String get_position(){
        position = Sc.Position;
        return position;
    }
    
    @Override
    public void set_position(String position){
        this.position = position;
    }
    
    public void upd_profile (String Email,String Newpassword, String Newfirstname, String Newlastname, int Newcontact_no, String Newaddress){
        String tempFile = "temptxt.txt";
        Customer cus = new Customer();
        if(cus.get_position() == "Customer"){
            File oldFile = new File("customertxt.txt");
            File newFile = new File(tempFile);
            String temp_email = ""; String temp_password = "";String temp_id_no = "";
            String temp_firstname = "";String temp_lastname = "";String temp_contact_no = "";
            String temp_address = ""; String temp_position = "";
            try
            {
                FileWriter fileWritter = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                PrintWriter pw = new PrintWriter(bw);
                Scanner s = new Scanner(new FileReader ("customertxt.txt"));
                s.useDelimiter("[,\n]");
                
                while (s.hasNext())
                {
                    temp_email = s.next();
                    temp_password = s.next();
                    temp_id_no = s.next();
                    temp_firstname= s.next();
                    temp_lastname=s.next();
                    temp_contact_no = s.next();
                    temp_address = s.next();
                    temp_position = s.next();
                    if (temp_email.equals(Email)){
                        pw.println(this.email + "," +
                        Newpassword + "," +
                        this.id_no + "," +
                        Newfirstname + "," +
                        Newlastname + ","+ 
                        Newcontact_no + "," +
                        Newaddress + "," +
                        this.position);
                        Sc.Password = Newpassword;
                        Sc.Firstname = Newfirstname;
                        Sc.Lastname = Newlastname;
                        Sc.Contactno = Newcontact_no;
                        Sc.Address = Newaddress;
                        JOptionPane.showMessageDialog(null,"Update success");
                        break;
                    }
                    
                    else{
                        pw.println(temp_email + "," +
                        temp_password + "," +
                        temp_id_no + "," +
                        temp_firstname + "," +
                        temp_lastname + ","+ 
                        temp_contact_no + "," +
                        temp_address + "," +
                        temp_position);
                        System.out.println("update");
                        
                    }
                         
                }
                s.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File("customertxt.txt");
                newFile.renameTo(dump);
            }
            catch(Exception e){
            
            }
        }
            
        
    }
    public boolean cart_select_cus_id(){
        boolean found = false;
        super.da.setTarget_file(new File("cartitemtxt.txt"));
        ArrayList<String> list = super.da.getAll();
        if (list != null){
            for (String record: list){
                String[] data = record.split("\\" + Seperator);
                Customer cus = new Customer();
                if (data[0].equals(cus.get_id_no())){
                    found = true;
                }
            }
        }
        return found;
    }
    
    public boolean order_select_cus_id(){
        boolean found = false;
        super.da.setTarget_file(new File("ordertxt.txt"));
        ArrayList<String> list = super.da.getAll();
        if (list != null){
            for (String record: list){
                String[] data = record.split("\\" + Seperator);
                Customer cus = new Customer();
                if (data[1].equals(cus.get_id_no())){
                    found = true;
                }
            }
        }
        return found;
    }
    
    
    
    
}

