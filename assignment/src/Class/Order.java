/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oodj.assignment.v1.Add_odr;

/**
 *
 * @author New
 */


public class Order{
    private int order_id;
    private String cus_id;
    private int total_item_qtt;
    private double grand_tll;
    
    public void set_cus_id(String cus_id){
        this.cus_id = cus_id;
    }
    public String get_cus_id(){
        return cus_id;
    }
    
    public void set_order_id(int order_id){
        this.order_id = order_id;
    }
    public int get_order_id(){
        return order_id;
    }

    
    public Order(){}
    public Order(int orderID, String cus_ID, int total_item_Qtt, double grand_tll){
        this.order_id = orderID;
        this.cus_id = cus_ID;
        this.total_item_qtt= total_item_Qtt;
        this.grand_tll = grand_tll;
    }
    
    
    public void insert_into_order( int orderID, String cus_ID, int total_item_Qtt, double grand_tll) throws IOException{
        FileWriter fw= new FileWriter("ordertxt.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(orderID+","+cus_ID+","+total_item_Qtt+","+grand_tll+",Pending");
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
    
    
    
    public ArrayList<Object[]> view_product(String cus_id,String order_status,DefaultTableModel tb, String fname){
        Scanner Sc = new Scanner(System.in);
        Object[] row =new Object[]{};
        ArrayList al = new ArrayList<Object[]>(); 
        try
        {
            File file2Read = new File(fname);
            Sc = new Scanner(file2Read);            
        
            while (Sc.hasNextLine()) 
            {
                 String Line = Sc.nextLine();
                 String[] Lgn = Line.split(",");
                 if (Lgn[1].equals(cus_id) && Lgn[4].equals("Pending")){
                     row = new Object[] {Lgn[0],Lgn[1],Lgn[2],Lgn[3],Lgn[4]};
                     al.add(row);
                 }
                 
            }
            Sc.close();
        }
        catch(IOException e)
        {
            
        }
        return al;
    }
    
    
    public ArrayList<Object[]> view_bill(String cus_id, DefaultTableModel tb, String OrderFile){
        Scanner Sc = new Scanner(System.in);
        Object [] row =new Object[]{};
        ArrayList al = new ArrayList<Object[]>(); 
        Customer cus = new Customer();
        cus.set_id_no(cus_id);
        try
        {
            File file2Read = new File(OrderFile);
            Sc = new Scanner(file2Read);            

            while (Sc.hasNextLine()) 
            {
                 String Line = Sc.nextLine();
                 String[] Lgn = Line.split(",");
                 if ((Lgn[1].equals(cus.get_id_no()) && Lgn[4].equals("Approved")) || (Lgn[1].equals(cus.get_id_no()) && Lgn[4].equals("Rejected"))){
                     row = new Object[] {Lgn[0],Lgn[1],Lgn[2],Lgn[3],Lgn[4]};
                     al.add(row);
                 }

            }
            Sc.close();
        }
        catch(IOException e)
        {

        }
        return al;
    }
    
    public ArrayList<Object[]> view_order(String cus_id, DefaultTableModel tb, String OrderFile){
        Scanner Sc = new Scanner(System.in);
        Object [] row =new Object[]{};
        ArrayList al = new ArrayList<Object[]>(); 
        try
        {
            File file2Read = new File(OrderFile);
            Sc = new Scanner(file2Read);            

            while (Sc.hasNextLine()) 
            {
                 String Line = Sc.nextLine();
                 String[] Lgn = Line.split(",");
                 if (Lgn[1].equals(cus_id) && Lgn[4].equals("Pending")){
                     row = new Object[] {Lgn[0],Lgn[1],Lgn[2],Lgn[3],Lgn[4]};
                     al.add(row);
                 }

            }
            Sc.close();
        }
        catch(IOException e)
        {

        }
        return al;
    }
    
    
    public ArrayList<Object[]> view_all_order(DefaultTableModel tb, String OrderFile){
        Scanner Sc = new Scanner(System.in);
        Object [] row =new Object[]{};
        ArrayList al = new ArrayList<Object[]>(); 
        try
        {
            File file2Read = new File(OrderFile);
            Sc = new Scanner(file2Read);            

            while (Sc.hasNextLine()) 
            {
                String Line = Sc.nextLine();
                String[] Lgn = Line.split(",");
                row = new Object[] {Lgn[0],Lgn[1],Lgn[2],Lgn[3],Lgn[4]};
                al.add(row);
                 

            }
            Sc.close();
        }
        catch(IOException e)
        {

        }
        return al;
    }
    
    public void approve_order(){
        
        String new_order_status = "Approved";
        System.out.println(this.order_id + "," 
                            + this.cus_id + ","  
                            + this.total_item_qtt + "," 
                            + this.grand_tll + ","
                            +new_order_status);
        ArrayList<String> array = new ArrayList<>();
        try(FileReader fr = new FileReader("ordertxt.txt")){
            Scanner read = new Scanner(fr);
            String line;
            String[] lineArr;
            
            while(read.hasNextLine()){
                
                line = read.nextLine();
                lineArr = line.split(",");
                
                if(lineArr[0].equals(Integer.toString(this.order_id)) ){            
                    
                    array.add(this.order_id + "," 
                            + this.cus_id + ","  
                            + this.total_item_qtt + "," 
                            + this.grand_tll + ","
                            +new_order_status);
                    JOptionPane.showMessageDialog(null,"Order Accepted");
                }
                else{
                    
                    array.add(line);
                }
            }
            
            fr.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            
            try(PrintWriter pr = new PrintWriter("ordertxt.txt")){
                for(String string : array){
                    pr.println(string);
                    System.out.println(string);
                }
                pr.close();

            }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Details","Login Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    } 
    public void reject_order(){
        
        String new_order_status = "Rejected";
        System.out.println(this.order_id + "," 
                            + this.cus_id + ","  
                            + this.total_item_qtt + "," 
                            + this.grand_tll + ","
                            +new_order_status);
        ArrayList<String> array = new ArrayList<>();
        try(FileReader fr = new FileReader("ordertxt.txt")){
            Scanner read = new Scanner(fr);
            String line;
            String[] lineArr;
            
            while(read.hasNextLine()){
                
                line = read.nextLine();
                lineArr = line.split(",");
                
                if(lineArr[0].equals(Integer.toString(this.order_id)) ){            
                    
                    array.add(this.order_id + "," 
                            + this.cus_id + ","  
                            + this.total_item_qtt + "," 
                            + this.grand_tll + ","
                            +new_order_status);
                    JOptionPane.showMessageDialog(null,"Order Accepted");
                }
                else{
                    
                    array.add(line);
                }
            }
            
            fr.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            
            try(PrintWriter pr = new PrintWriter("ordertxt.txt")){
                for(String string : array){
                    pr.println(string);
                    System.out.println(string);
                }
                pr.close();

            }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Details","Login Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    } 
    
}
