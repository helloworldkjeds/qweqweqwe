/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author New
 */


public class Product {
    
    protected String pdt_id,pdt_name,pdt_ctgy,pdt_id_no;
    protected int pdt_qtt;
    protected double pdt_price;
    
    public Product(){}
    
    private final String ProductFile = "producttxt.txt";
    
    public String get_pdt_id(){
        return pdt_id;
    }
    public void set_pdt_id(String pdt_id){
        this.pdt_id = pdt_id;
    }
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
    
    public double calculate_final_price(double pdt_Price,String pdt_Ctgy){
        
        double final_price = 0;
        Product pdt = new Product();
        pdt.set_pdt_price(pdt_Price);
        pdt.set_pdt_ctgy(pdt_Ctgy);
        
        if (pdt.get_pdt_ctgy() == "Non-fragile"){
            final_price = pdt.get_pdt_price() + (pdt.get_pdt_price() * 0.05);  
        }
        else if (pdt.get_pdt_ctgy() == "Fragile"){
            final_price = pdt.get_pdt_price() + (pdt.get_pdt_price() * 0.1);
        }
        DecimalFormat df2 = new DecimalFormat(".##");
        String totalprice_String = df2.format(final_price);
        final_price = Double.parseDouble(totalprice_String);
        System.out.println(final_price);
        
        return final_price;
    }
    
    public double calculate_total_price(double pdt_Price,int odr_Qtt){
        
        double total_price = 0;
        Product pdt = new Product();
        
        pdt.set_pdt_price(pdt_Price);
        pdt.set_pdt_qtt(odr_Qtt);
        
        total_price = pdt.get_pdt_price() * pdt.get_pdt_qtt();
        DecimalFormat df2 = new DecimalFormat(".##");
        String totalprice_String = df2.format(total_price);
        total_price = Double.parseDouble(totalprice_String);
        System.out.println(total_price);
        
        return total_price;
        
    }
    
    public void add_product(String pdt_Name,int pdt_Qtt,double pdt_final_Price,String pdt_Ctgy){
        
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
                    pdt_Name + "," +
                    pdt_Qtt + "," +
                    pdt_final_Price + ","+ 
                    pdt_Ctgy);

            pw.flush();
            pw.close();
            System.out.println("Product registered successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Product Details","Product register Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public ArrayList<Object[]> view_product(DefaultTableModel tb, String fname){
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
    
    public void update_product(String pdt_ID, String pdt_Name, int odr_Qtt,double final_Price,String pdt_Ctgy){
        
        ArrayList<String> array = new ArrayList<>();
        try (FileReader fr = new FileReader(ProductFile)) {
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                String lines = scan.nextLine();
                String[] ArrayLine = lines.split(",");
                if (ArrayLine[0].equals(pdt_ID)) {
                    
                    array.add(pdt_ID + "," + pdt_Name + "," + odr_Qtt + "," + final_Price + "," + pdt_Ctgy);
                    JOptionPane.showMessageDialog(null, "Successfully Update Order item.");
                    System.out.println(pdt_ID + "," + pdt_Name + "," + odr_Qtt + "," + final_Price + "," + pdt_Ctgy);
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
            try (PrintWriter pr = new PrintWriter(ProductFile)) {
                for (String str : array) {
                    pr.println(str);
                }
                pr.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Write file failed", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    public void delete_product(String pdt_ID) {

        
        File inputFile = new File(ProductFile);
        File tempFile = new File("temp.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                ArrayList<String> List = new ArrayList<>(Arrays.asList(currentLine.split(",")));
                
                if (!List.get(0).equals(pdt_ID)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                } else {
                    JOptionPane.showMessageDialog(null, "Product Deleted!", "Notification", JOptionPane.INFORMATION_MESSAGE);
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
        
        
        
    