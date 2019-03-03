/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.text.DecimalFormat;

/**
 *
 * @author jcgan
 */
public class Fragile extends Product {
    @Override
    public double calculate_final_price(double pdt_Price,String pdt_Ctgy){
        
        double final_price = 0;
        Product pdt = new Product();
        pdt.set_pdt_price(pdt_Price);
        pdt.set_pdt_ctgy(pdt_Ctgy);
        
        
        final_price = pdt.get_pdt_price() + (pdt.get_pdt_price() * 0.1);
        
        DecimalFormat df2 = new DecimalFormat(".##");
        String totalprice_String = df2.format(final_price);
        final_price = Double.parseDouble(totalprice_String);
        System.out.println(final_price);
        
        return final_price;
    }
}
