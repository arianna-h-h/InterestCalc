/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interestcalc;

/**
 *
 * @author ariannaharadon
 */


import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;



public class InterestCalc {

    
    public static void main(String[] args) {
        
        //result
      double priceWithInterest; 
      //term 
      double term;
      //rate
      double rate;
      //prie
      double price;
      double interest;
      double excessInterest;
      
      //A = P(1 + r/n)nt
       
      Scanner scan = new Scanner(System.in); 
      System.out.println("Plz enter the number of months: ");
      term = scan.nextDouble();
      System.out.println("Plz enter the interest rate: ");
      rate = scan.nextDouble();
      System.out.println("Plz enter the original price: ");
      price = scan.nextDouble();
      
      rate = rate/100;
      priceWithInterest = price* (Math.pow((1.0 + rate/12.0), (term)));
      
      DecimalFormat df = new DecimalFormat("###.##");
      System.out.println("Total price " + df.format(priceWithInterest));
      System.out.println("Excess paid " + df.format(priceWithInterest-price));
      
      
    }
    
}
