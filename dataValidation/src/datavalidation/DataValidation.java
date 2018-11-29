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
        System.out.println("Hello, welcome to the data input challenge, pay close attention to the instructions and good luck!");
        sixChar ();
        lowerA ();
        notZ ();
    }
        
        public static void sixChar (){
        String myInput;
        String sixPlus;
        int length =0;  
        
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
       public static void lowerA (){    
        String userInput;
        String lowera;
        int length =0;  
        
        try {
            //user input
            lowera = JOptionPane.showInputDialog("enter a string with a lowercase a.");
         
            //will crash if lowera doesn't have an a
           length= (lowera.length());
            System.out.println("" + lowera);
            
           if(lowera.contains ("a") == false){
                throw new Exception("This word doesn't contain a lowercase a!");
            }
        } catch (Exception  e) {
            System.err.println(e.getMessage());
            
        } 
       }
       
        public static void notZ (){    
        String userInput;
        String notz;
        int length =0;  
        
        try {
            //user input
            notz = JOptionPane.showInputDialog("enter a string that doesn't contain a z and is between 5-15 characters.");
         
            //will crash if lowera doesn't have an a
           length= (notz.length());
            System.out.println("" + notz);
            
           if(notz.contains ("Z") == true){
                throw new Exception("This word contains a Z!");
            } 
           else if(notz.contains ("z") == true){
                throw new Exception("This word contains a z!");
            } 
           else if(length <5 || length > 15 ){
                throw new Exception("This word doesn't have between 5-15 characters");
            } 
        } catch (Exception  e) {
            System.err.println(e.getMessage());
            
        } 
       }
}

