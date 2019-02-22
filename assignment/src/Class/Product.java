/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author New
 */


public class Product {
    
    protected String pdt_name,pdt_ctgy,pdt_id_no;
    protected int pdt_qtt;
    protected double pdt_price;
    
    public Product(){}
    
    private final String ProductFile = "producttxt.txt";
    
    public String get_pdt_name(){
        return pdt_name;
    }
    public void set_pdt_name(String pdt_name){
        this.pdt_name = pdt_name;
    }
    
    public String get_pdt_ctgy(){
        return pdt_ctgy;
    }
    public void set_pdt_ctgy(String pdt_ctgy){
        this.pdt_ctgy = pdt_ctgy;
    }
    
    public int get_pdt_qtt(){
        return pdt_qtt;
    }
    public void set_pdt_qtt(int pdt_qtt){
        this.pdt_qtt = pdt_qtt;
    }
    
    public double get_pdt_price(){
        return pdt_price;
    }
    public void set_pdt_price(double pdt_price){
        this.pdt_price = pdt_price;
    }
    
    
    public void add_product(String pdt_name,int pdt_qtt,double pdt_price,String pdt_ctgy){
        
        LocalDate localDate = LocalDate.now();
        //System.out.println(DateTimeFormatter.ofPattern("dd").format(localDate));
        Random random = new Random();
        int random_no1 = random.nextInt(9);
        int random_no2 = random.nextInt(9);
        int random_no3 = random.nextInt(9);
        String temp_id_no="";
        boolean found=false;
        try{    
            pdt_id_no = ("PD" + random_no1 + random_no2  + DateTimeFormatter.ofPattern("dd").format(localDate) + random_no3);
            File writefile = new File(ProductFile);
            FileWriter fileWritter = new FileWriter(writefile,true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(pdt_id_no + "," +
                    pdt_name + "," +
                    pdt_qtt + "," +
                    pdt_price + ","+ 
                    pdt_ctgy);

            pw.flush();
            pw.close();
            System.out.println("Product registered successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Product Details","Product register Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
        
        
        
    