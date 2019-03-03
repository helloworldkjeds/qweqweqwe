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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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
    //put orderitem inside order class
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
            JOptionPane.showMessageDialog(null,"Product added to cart!","Add Cart",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Add to cart fail!","Add to cart Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Object[]> view_cart_item(DefaultTableModel tb, String fname){
        Scanner Sc = new Scanner(System.in);
        Object[] row =new Object[]{};
        ArrayList array = new ArrayList<Object[]>(); 
        try
        {
            File file2Read = new File(fname);
            Sc = new Scanner(file2Read);            
        
            while (Sc.hasNextLine()) 
            {
                 String Line = Sc.nextLine();
                 String[] Lgn = Line.split(",");
                 row = new Object[] {Lgn[0],Lgn[1],Lgn[2],Lgn[3],Lgn[4],Lgn[5],Lgn[6]};  
                 array.add(row);
            }
            Sc.close();
        }
        catch(IOException e)
        {
            
        }
        return array;
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
    public void cart_delete(String cusID) {

        
        File oldFile = new File("cartitemtxt.txt");
        File tempFile = new File("tempcartitemtxt.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(oldFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            Customer cus = new Customer();    
            while ((currentLine = reader.readLine()) != null) {
                ArrayList<String> List = new ArrayList<>(Arrays.asList(currentLine.split(",")));
                
                if (!List.get(0).equals(cus.get_id_no())) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                } 
                /*else {
                    JOptionPane.showMessageDialog(null, "Cart cleared.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                }*/
            }
            JOptionPane.showMessageDialog(null, "Cart cleared!", "Notification", JOptionPane.INFORMATION_MESSAGE);
            writer.close();
            reader.close();

            if (!oldFile.delete()) {
                JOptionPane.showMessageDialog(null, "clear cart fail !", "Error", JOptionPane.WARNING_MESSAGE);
            }

            if (!tempFile.renameTo(oldFile)) {
                JOptionPane.showMessageDialog(null, "clear cart fail !", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        tempFile.renameTo(oldFile);
    }
    
    public ArrayList<Object[]> view_order_item(int order_id, DefaultTableModel tb, String OrderItemFile){
        Scanner Sc = new Scanner(System.in);
        Object [] row =new Object[]{};
        ArrayList array = new ArrayList<Object[]>(); 
        String ID = Integer.toString(order_id);
        try
        {
            File file2Read = new File(OrderItemFile);
            Sc = new Scanner(file2Read);            
        
            while (Sc.hasNextLine()) 
            {
                 String Line = Sc.nextLine();
                 String[] lines = Line.split(",");
                 
                 if (lines[0].equals(ID)){
                     row = new Object[] {lines[0],lines[2],lines[3],lines[4],lines[5],lines[6],lines[7]};
                     array.add(row);
                 }
                 
            }
            Sc.close();
        }
        catch(IOException e)
        {
            
        }
        return array;
    }
    
    
    public void update_order_item(String cus_ID, String pdt_ID, String pdt_Name, int odr_Qtt,double unit_Price,double total_Price,String pdt_Ctgy){
        
        ArrayList<String> array = new ArrayList<>();
        try (FileReader fr = new FileReader("cartitemtxt.txt")) {
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                String lines = scan.nextLine();
                String[] ArrayLine = lines.split(",");
                if (ArrayLine[1].equals(pdt_ID) && ArrayLine[0].equals(cus_ID)) {
                    
                    array.add(cus_ID + "," + pdt_ID + "," + pdt_Name + "," + odr_Qtt + "," + unit_Price + "," + total_Price + "," + pdt_Ctgy);
                    JOptionPane.showMessageDialog(null, "Successfully Update Order item.");
                    System.out.println(cus_ID + "," + pdt_ID + "," + pdt_Name + "," + odr_Qtt + "," + unit_Price + "," + total_Price + "," + pdt_Ctgy);
                } else {
                    
                    array.add(lines);
                }
            }
            //close the file writter
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // open the print writter to write array data into textfile
            try (PrintWriter pr = new PrintWriter("cartitemtxt.txt")) {
                for (String str : array) {
                    pr.println(str);
                }
                pr.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Write file failed", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void delete_order_item(String pdt_ID) {

        
        File inputFile = new File("cartitemtxt.txt");
        File tempFile = new File("temp.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                ArrayList<String> List = new ArrayList<>(Arrays.asList(currentLine.split(",")));
                
                if (!List.get(1).equals(pdt_ID)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                } else {
                    JOptionPane.showMessageDialog(null, "Order item Deleted!", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            writer.close();
            reader.close();

            if (!inputFile.delete()) {
                JOptionPane.showMessageDialog(null, "delete in file fail !", "Error", JOptionPane.WARNING_MESSAGE);
            }

            if (!tempFile.renameTo(inputFile)) {
                JOptionPane.showMessageDialog(null, "rename file fail !", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        tempFile.renameTo(inputFile);
        

    }
    
}
