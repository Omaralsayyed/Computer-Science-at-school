/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package typecasting;
import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner keyedInput = new Scanner(System.in);   
        double wholeNum=0;
        System.out.println("Please enter a whole number. ");
        wholeNum = keyedInput.nextDouble ();
        
        int wholeInt;
        wholeInt = (int)wholeNum;
        System.out.println("Your number is: " + wholeInt);
        
        double decNum=0;
        System.out.println("Please enter a decimal number. ");
        decNum = keyedInput.nextDouble ();
        System.out.println("Your number is: " + decNum);
       
 
        
    }
    
}
