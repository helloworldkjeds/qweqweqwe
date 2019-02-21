/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author New
 */
public class User {
    
    protected String id_no,email,password,firstname,lastname,address,position;
    
    protected int contact_no;
    
    
    public User() {
        
    }
    
    public User(String email,String password,String position){
        this.email =email;
        this.password = password;
        this.position = position;
    }
    
    public User(String email,String password,String firstname,String lastname,int contact_no,String address,String position){
        this.email =email;
        this.password = password;
        this.firstname=firstname;
        this.lastname = lastname;
        this.contact_no = contact_no;
        this.address = address; 
        this.position = position;
    }
    
    
    public String get_id_no(){
            return id_no;
    }
    
    public void set_id_no(String id_no){
        this.id_no = id_no;
    }
    
    
    
    //email accessor
    public String get_email(){
        return email;
    }
    //email mutator
    public void set_email(String email){
        this.email = email;
    }
    
    //password accessor
    public String get_pwd(){
        return password;
    }
    //password mutator
    public void set_pwd(String password){
        this.password = password;
    }
    
    //firstname accessor
    public String get_firstname(){
        return firstname;
    }
   
    //firstname mutator
    public void set_firstname(String firstname){
        this.firstname = firstname;
    }
    
    //lastname accessor
    public String get_lastname(){
        return lastname;
    }
    
    //lastname mutator
    public void set_lastname(String lastname){
        this.lastname = lastname;
    }
    
    public int get_contact_no(){
        
        return contact_no;
    }
    
    
    public void set_contact_no(int contact_no){
       
        this.contact_no = contact_no;
        
    }
    //address accessor
    public String get_address(){
        return address;
    }
    
    //address mutator
    public void set_address(String address){
        this.address = address;
    }
    
    //position accessor
    public String get_position(){
        return position;
    }
   
    //position mutator
    public void set_position(String position){
        this.position = position;
    }
    
    public void user_register(String email,String password,String firstname,String lastname,int contact_no,String address,String position){
        int count = 1;
        count +=1;
        String temp_email=""; 
        String temp_id_no="";
        boolean found=false;boolean create_user = true;
        try{
            if (position == "Admin"){
                Scanner s = new Scanner (new File("admintxt.txt"));
                s.useDelimiter("[,\n]");
                while (s.hasNext() && !found ){
                    temp_email=s.next();
                    if (temp_email.equals(email)){
                        create_user = false;
                    }
                    
                   
                }
                s.close();
            }
            else if(position == "Customer"){
                Scanner s = new Scanner (new File("customertxt.txt"));
                s.useDelimiter("[,\n]");
                while (s.hasNext() && !found ){
                    temp_email=s.next();
                    if (temp_email.equals(email)){
                        create_user = false;
                    } 
                }
                s.close();
            }
            
        if(create_user){
            if(position == "Admin"){
                
                File writefile = new File("admintxt.txt");
                FileWriter fileWritter = new FileWriter(writefile,true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                PrintWriter pw = new PrintWriter(bw);
                id_no = ("AD00" + count);
                pw.println(email + "," +
                        password + "," +
                        id_no + "," +
                        firstname + "," +
                        lastname + ","+ 
                        contact_no + "," +
                        address + "," +
                        position);
                        
                pw.flush();
                pw.close();
                System.out.println("Register successfully ");
            }
            else if (position == "Customer"){
                File writefile = new File("customertxt.txt");
                if(!writefile.exists()) {
                   writefile.createNewFile();
                }
                FileWriter fileWritter = new FileWriter(writefile,true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(email + "," +
                        password + "," +
                        "CU00" + count + "," +     
                        firstname + "," +
                        lastname + "," + 
                        contact_no + "," +
                        address + "," +
                        position);
                pw.flush();
                pw.close();
                System.out.println("Register successfully.");
            }
        }
        else if (!create_user){
                JOptionPane.showMessageDialog(null,"Email cannot be same.");
                
            }
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
        }
    }    
        
    
    public String user_validate(String Email, String Password,String Position){
        
        String temp_email = ""; String temp_password = "";String temp_id_no = "";
        String temp_firstname = "";String temp_lastname = "";String temp_contact_no = "";
        String temp_address = ""; String temp_position = "";
        boolean found = false;
        try
        {
        if (position == "Admin"){
            Scanner s = new Scanner(new FileReader ("admintxt.txt"));
            s.useDelimiter("[,\n]");
            while (s.hasNext()&& !found)
            {
                temp_email = s.next();
                temp_password = s.next();
                temp_id_no = s.next();
                temp_firstname= s.next();
                temp_lastname=s.next();
                temp_contact_no = s.next();
                temp_address = s.next();
                temp_position = s.next();

                if (temp_email.equals(Email) && temp_password.equals(Password)){
                    found = true;
                    this.email=Email;
                    this.password=temp_password;
                    this.id_no=temp_id_no;
                    this.firstname=temp_firstname;
                    this.lastname= temp_lastname;
                    this.contact_no = Integer.parseInt(temp_contact_no);
                    this.address = temp_address;
                    
                    
                }
            }
            s.close();
        }
        else if(position == "Customer"){
            Scanner s = new Scanner(new FileReader ("customertxt.txt"));
            s.useDelimiter("[,\n]");
            while (s.hasNext()&& !found)
            {
                temp_email = s.next();
                temp_password = s.next();
                temp_id_no = s.next();
                temp_firstname= s.next();
                temp_lastname=s.next();
                temp_contact_no = s.next();
                temp_address = s.next();
                temp_position = s.next();

                if (temp_email.equals(Email) && temp_password.equals(Password)){
                    found = true;
                    this.email=Email;
                    this.password=temp_password;
                    this.id_no=temp_id_no;
                    this.firstname=temp_firstname;
                    this.lastname= temp_lastname;
                    this.contact_no = Integer.parseInt(temp_contact_no);
                    this.address = temp_address;
                }
            }
            s.close();
        }
        
        if (found)
        {   
            StaticClass Sc = new StaticClass();
            Sc.Email = this.email;
            Sc.Password = this.password;
            Sc.ID_no = this.id_no;
            Sc.Firstname = this.firstname;
            Sc.Lastname = this.lastname;
            Sc.Contactno = this.contact_no;
            Sc.Address = this.address;
            Sc.Position = this.position;
            return position;
            
            
        } 
        else
        {
            JOptionPane.showMessageDialog(null,"Login failed! Please try again." );
            //System.out.println(Email+" " + Password + " " +Position);
            //System.out.println(temp_email+ " "+ temp_password+ " "+ temp_position);
            
        }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: unable to read file");
            System.out.println(temp_id_no);
            return "fail";
            
        }
        return "fail";
    }
}
