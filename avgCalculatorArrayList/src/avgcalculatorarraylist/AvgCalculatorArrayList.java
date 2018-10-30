/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avgcalculatorarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class AvgCalculatorArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     ArrayList myStrings = new ArrayList();
        
     	Scanner input = new Scanner(System.in);
//        int numMarks ;
        System.out.println("How many marks do you want to enter?:");
        int numMarks;
        int total = 0;
      
 
         numMarks = keyedInput.nextInt();
        
          int [ ] numbers = new int [numMarks];
        //Get ten marks
        System.out.println("Enter" + numMarks +  "marks and they will be averaged:");
        for (int i = 0; i <numMarks; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //add them together
        for (int i = 0; i <= numMarks; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        // Calcultae average
        int average = total/numMarks;
        
        System.out.println("Your average mark is: " + average);
       
        }
    
}
