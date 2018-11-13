/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myfirstsubroutine;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class MyFirstSubroutine {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner (System.in);
        System.out.println("Welcome to the super shape calculator!");
        System.out.println("If you would like to find the area of a rectangle enter 1."
               + "\nIf you would like to find the area of a triangle enter 2."
                + "\nIf you would like to find the perimeter of a rectangle enter 3. "
                + "\nIf you would like to find the perimeter of a square enter 4."
                + "\nIf you would like to find the area of a square enter 5" );
        int choice = keyedInput.nextInt();
        
        if (choice==1){
            areaOfRect();
        } else if (choice==2){
            areaOfTri();
        } else if (choice==3){
            perimeterOfRect();
        } else if (choice==4){
            perimeterOfSquare();
        }else if (choice==5){
            areaOfSquare(); }
    }
     public static void areaOfRect ()
             
    {  Scanner keyedInput = new Scanner (System.in);
        int length = 0; 
        int width =0;
        System.out.println("Enter the length meausurement:");
        length = keyedInput.nextInt();
         System.out.println("Enter the width meausurement:");
         width = keyedInput.nextInt();
       
        int product = length*width; 
        System.out.println(product);}
          
     
     public static void areaOfTri ()
             
    {  Scanner keyedInput = new Scanner (System.in);

        System.out.println("Enter the length meausurement:");
        int length = keyedInput.nextInt();
         System.out.println("Enter the hight meausurement:");
        int width = keyedInput.nextInt();
       
        int product = (length*width)/2; 
        System.out.println("The area of the triangle is: "+ product +".");}
     
    public static void perimeterOfRect ()
             
    {  Scanner keyedInput = new Scanner (System.in);

        System.out.println("Enter the length meausurement:");
        int length = keyedInput.nextInt();
         System.out.println("Enter the width meausurement:");
        int width = keyedInput.nextInt();
       
        int product = (length*2) + (width*2); 
        System.out.println("The perimeter of the rectangle is: "+ product +".");}
      
    public static void perimeterOfSquare ()
             
    {  Scanner keyedInput = new Scanner (System.in);

        System.out.println("Enter one side meausurement:");
        int length = keyedInput.nextInt();
         
       
        int product = length*4; 
        System.out.println("The perimeter of the square is: "+ product +".");}
    
    public static void areaOfSquare ()
             
    {  Scanner keyedInput = new Scanner (System.in);

        System.out.println("Enter one side meausurement:");
        int length = keyedInput.nextInt();
        int product = length*length; 
        System.out.println("The area of the square is: "+ product +".");}
}

