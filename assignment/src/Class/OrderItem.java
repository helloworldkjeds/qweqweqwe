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

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author New
 */
public class OrderItem{
    
    private final String CartFile = "cartitemtxt.txt";
    private final String OrderItemFile = "orderitemtxt.txt";
    
    protected int order_id;
    public OrderItem(){}
    
    public int get_order_id(){
        return order_id;
    }

    public void set_order_id(int order_id){
        this.order_id = order_id;
    }
    
    public void add_order_item(String pdt_ID, String pdt_Name,int pdt_Qtt,double unit_Price,double total_Price,String pdt_Ctgy){
        
        try{    
            
            File writefile = new File(CartFile);
            FileWriter fileWritter = new FileWriter(writefile,true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            PrintWriter pw = new PrintWriter(bw);
            Customer cus = new Customer();
            
            pw.println(cus.get_id_no() + "," 
                    + pdt_ID + "," 
                    + pdt_Name + "," 
                    + pdt_Qtt + "," 
                    + unit_Price + "," +
                    + total_Price + "," + 
                    pdt_Ctgy);

            pw.flush();
            pw.close();
            System.out.println("Product added to cart successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Add to cart fail!","Add to cart Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public ArrayList<Object[]> view_cart_item(DefaultTableModel tb, String fname){
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
                 row = new Object[] {Lgn[0],Lgn[1],Lgn[2],Lgn[3],Lgn[4],Lgn[5],Lgn[6]};  
                 al.add(row);
            }
            Sc.close();
        }
        catch(IOException e)
        {
            
        }
        return al;
    }
    
    public int new_order_id(){
        FileInputStream in;
        try {
            in = new FileInputStream(OrderItemFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine = null, tmp;
            if (br.readLine() == null){return 1;}
            while ((tmp = br.readLine()) != null){strLine = tmp;}
            String lastLine = strLine;
            String[] lgn = lastLine.split(",");
            order_id = Integer.parseInt(lgn[0]) + 1;
            in.close();
            return order_id;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrderItem.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (IOException ex) {
            Logger.getLogger(OrderItem.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
    
    public void insert_into_orderitem(int order_ID, String cus_ID, String pdt_ID, String pdt_Name, double pdt_Price, double total_Price, int pdt_Qtt,String pdt_Ctgy) throws IOException{
        FileWriter fw= new FileWriter(OrderItemFile,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(order_ID+","+cus_ID+","+pdt_ID+","+pdt_Name+","+pdt_Price+","+total_Price+","+pdt_Qtt+"," +pdt_Ctgy);
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
}
