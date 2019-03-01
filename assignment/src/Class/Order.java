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
import javax.swing.table.DefaultTableModel;
import oodj.assignment.v1.Add_odr;

/**
 *
 * @author New
 */


public class Order{
    
    
    
    
    private int order_id;
    public int get_order_id(){
        return order_id;
    }

    
    public void set_order_id(int order_id){
        this.order_id = order_id;
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
        try
        {
            File file2Read = new File(OrderFile);
            Sc = new Scanner(file2Read);            

            while (Sc.hasNextLine()) 
            {
                 String Line = Sc.nextLine();
                 String[] Lgn = Line.split(",");
                 if (Lgn[1].equals(cus_id) && (Lgn[4].equals("Accepted") || Lgn[4].equals("Rejected"))){
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
    
}
