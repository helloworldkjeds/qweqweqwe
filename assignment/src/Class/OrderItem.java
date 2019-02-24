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
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author New
 */
public class OrderItem extends DataObject{
    protected String orderitem_id;
    private final String OrderItemFile = "orderitemtxt.txt";
    
    public OrderItem(){}
    
    public void add_order_item(String pdt_ID, String pdt_Name,int pdt_Qtt,double unit_Price,double total_Price,String pdt_Ctgy){
        /*
        LocalDate localDate = LocalDate.now();
        //System.out.println(DateTimeFormatter.ofPattern("dd").format(localDate));
        Random random = new Random();
        int random_no1 = random.nextInt(9);
        int random_no2 = random.nextInt(9);
        int random_no3 = random.nextInt(9);
        //String temp_id_no="";
        //boolean found=false;
        */
        try{    
            
            File writefile = new File(OrderItemFile);
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
    
    public boolean select_cus_id(){
        boolean found = false;
        super.da.setTarget_file(new File(OrderItemFile));
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
    
    public ArrayList<Object[]> view_order_item(DefaultTableModel tb, String fname){
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
}
