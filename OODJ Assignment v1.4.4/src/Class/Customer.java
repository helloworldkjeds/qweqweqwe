/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Class.User;

/**
 *
 * @author New
 */
public class Customer extends User{
    public Customer(){
        
    }
    
    
    StaticClass Sc = new StaticClass();
    @Override
    public String get_id_no(){
        return Sc.ID_no;
    }
    
    @Override
    public void set_id_no(String id_no){
        this.id_no = id_no;
    }
    
    @Override
    public String get_email(){
        return Sc.Email;
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
    
    
    
}

