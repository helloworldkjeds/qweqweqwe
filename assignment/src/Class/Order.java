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
public class Order extends OrderItem{
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
}
