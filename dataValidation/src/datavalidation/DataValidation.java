/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datavalidation;

import javax.swing.JOptionPane;

/**
 *
 * @author omsay9559
 */
public class DataValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myInput;
        String sixPlus;
        int length =0;
        
       
        System.out.println("Hello, welcome to the data input challenge, pay close attention to the instructions and good luck!");
        try {
            //user input
            sixPlus = JOptionPane.showInputDialog("enter a string with more than 6 letters.");
           
           
            
            
            //will crash if sixPlus is less than 6 
           length= (sixPlus.length());
            System.out.println("" + length);
            
            if (length <7) {
                throw new Exception("This word is too short.");
            }
        } catch (Exception  e) {
            System.err.println(e.getMessage());
            
        } 
    }
    
}
