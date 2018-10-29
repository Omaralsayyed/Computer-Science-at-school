/*
 * Omar Sayyed
october 29th 2018
Asks user for the last ten marks and finds the average
 */

package averagecalculator;

import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner keyedInput = new Scanner (System.in);
        //initialise variables
 
        int [ ] numbers = new int [10];
        int total = 0;
        final int NUM_MARKS = 10;
        
        //Get ten marks
        System.out.println("Enter ten marks and they will be averaged:");
        for (int i = 0; i <= 9; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //add them together
        for (int i = 0; i <= 9; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        // Calcultae average
        int average = total/NUM_MARKS;
        
        System.out.println("Your average mark is: " + average);
       
        
            
    //tell user letter grade 
         if (average < 50) {
            System.out.println("You have failed");
}   
         else if (average <=60)   {
            System.out.println("You have a D");
}
         else if (average <= 70){
            System.out.println("You have a C");
}
         else if (average <= 80){
            System.out.println("You have a B");
}
         else if (average <= 100){
            System.out.println("Congrats, you have an A");
}

}}
