/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import oodj.assignment.v1.Admin_Menu;
import oodj.assignment.v1.Cus_Menu;

/**
 *
 * @author New
 */
public class User extends DataObject{
    
    protected String id_no,email,password,firstname,lastname,address,position;    
    protected int contact_no;
    private final String CusFile = "customertxt.txt";
    private final String AdminFile = "admintxt.txt";
    
    public User(){}
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
        
        LocalDate localDate = LocalDate.now();
        //System.out.println(DateTimeFormatter.ofPattern("dd").format(localDate));
        Random random = new Random();
        int random_no1 = random.nextInt(9);
        int random_no2 = random.nextInt(9);
        int random_no3 = random.nextInt(9);
        
        
        
        String temp_email=""; 
        String temp_id_no="";
        boolean found=false;boolean create_user = true;
        try{
            if (position == "Admin"){
                Scanner s = new Scanner (new File(AdminFile));
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
                id_no = ("AD" + random_no1 + random_no2 + random_no3 + DateTimeFormatter.ofPattern("dd").format(localDate) );
                File writefile = new File(AdminFile);
                FileWriter fileWritter = new FileWriter(writefile,true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                PrintWriter pw = new PrintWriter(bw);
                
                pw.println(this.email + "," +
                        this.password + "," +
                        this.id_no + "," +
                        this.firstname + "," +
                        this.lastname + ","+ 
                        this.contact_no + "," +
                        this.address + "," +
                        this.position);
                        
                pw.flush();
                pw.close();
                System.out.println("Registration Success!");
            }
            else if (position == "Customer"){
                id_no = ("CU" + random_no1 + random_no2 + random_no3 + DateTimeFormatter.ofPattern("dd").format(localDate) );
                File writefile = new File(CusFile);
                if(!writefile.exists()) {
                   writefile.createNewFile();
                }
                FileWriter fileWritter = new FileWriter(writefile,true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(this.email + "," +
                        this.password + "," +
                        this.id_no + "," +     
                        this.firstname + "," +
                        this.lastname + "," + 
                        this.contact_no + "," +
                        this.address + "," +
                        this.position);
                pw.flush();
                pw.close();
                System.out.println("Registration Success!");
            }
        }
        else if (!create_user){
                JOptionPane.showMessageDialog(null,"Email address cannot be identical.");
                
            }
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
        }
    }    
        
    
    public boolean user_validate(String Email, String Password,String Position){
        boolean found = false;
        if (Position.equals("Admin")){
            super.da.setTarget_file(new File(AdminFile));
            ArrayList<String> list = super.da.getAll();
            if (list != null){
                for (String record: list){
                    String[] data = record.split("\\" + Seperator);
                    if (data[0].equals(this.get_email()) && data[1].equals(this.get_pwd())){
                        found = true;
                        this.set_id_no(data[2]);
                        this.set_firstname(data[3]);
                        this.set_lastname(data[4]);
                        this.set_contact_no(Integer.parseInt(data[5]));
                        this.set_address(data[6]);
                        StaticClass Sc = new StaticClass();
                        Sc.Email = this.get_email();
                        Sc.Password = this.get_pwd();
                        Sc.ID_no = this.get_id_no();
                        Sc.Firstname = this.get_firstname();
                        Sc.Lastname = this.get_lastname();
                        Sc.Contactno = this.get_contact_no();
                        Sc.Address = this.get_address();
                        Sc.Position = this.get_position();
                        Admin_Menu am = new Admin_Menu();
                        am.setVisible(true);
                        break;
                    }
                }
            }
        }
        else if(Position.equals("Customer")){
            super.da.setTarget_file(new File(CusFile));
            ArrayList<String> list = super.da.getAll();
            if (list != null){
                for (String record: list){
                    String[] data = record.split("\\" + Seperator);
                    if (data[0].equals(this.get_email()) && data[1].equals(this.get_pwd())){
                        found = true;
                        this.set_id_no(data[2]);
                        this.set_firstname(data[3]);
                        this.set_lastname(data[4]);
                        this.set_contact_no(Integer.parseInt(data[5]));
                        this.set_address(data[6]);
                        StaticClass Sc = new StaticClass();
                        Sc.Email = this.get_email();
                        Sc.Password = this.get_pwd();
                        Sc.ID_no = this.get_id_no();
                        Sc.Firstname = this.get_firstname();
                        Sc.Lastname = this.get_lastname();
                        Sc.Contactno = this.get_contact_no();
                        Sc.Address = this.get_address();
                        Sc.Position = this.get_position();
                        Cus_Menu cus = new Cus_Menu();
                        cus.setVisible(true);
                        break;
                    }
                }
            }
        }
        return found;
    }
}

    /*
        String temp_email = ""; String temp_password = "";String temp_id_no = "";
        String temp_firstname = "";String temp_lastname = "";String temp_contact_no = "";
        String temp_address = ""; String temp_position = "";
        
        try
        {
        if (position == "Admin"){
            Scanner s = new Scanner(new FileReader (AdminFile));
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
    */

