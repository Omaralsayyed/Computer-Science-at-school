/*
 *Omar Sayyed
October 24 2018
calculates squares, powers and cubes for the user
*/

package cubessquaresandpowers;
import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class CubesSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);  
        
        int userNum = 0;
        int userBase = 0;
        int choice = 0;
        int newNum = 0;
        int userPower= 0;
        
 
         do
         {
            System.out.println("Please choose an option:");
            System.out.println("1) Find the value of a number squared" );
            System.out.println("2) Find the value of a number cubed ");
            System.out.println("3) Find the value of a number, to any power");
            System.out.println("4) Exit");
        
        choice = keyedInput.nextInt();
//        newNum= keyedInput.nextInt();
//        } while (choice != 4); 
        {
       
            switch (choice)
            {
                case (1): 
                    System.out.println("Enter the number you would like to square:");
                    userNum = keyedInput.nextInt();
                     for (int i = 1; i <2 ; i = i + 1)

                    {
                       newNum = userNum*userNum;
                    }System.out.println(newNum); 
                    
                case (2): 
                    System.out.println("Enter the number you would like to cube:");
                    userNum = keyedInput.nextInt();
                    newNum= userNum;
                     for (int i = 1; i <3 ; i = i + 1)

                    {
                       newNum = newNum*userNum;
                    }System.out.println(newNum); 
                    
                 case (3): 
                    System.out.println("Enter the number you would like to be the base:");
                    userNum = keyedInput.nextInt();
                    System.out.println("Enter the the power which you would like to apply on " + userNum);
                    userPower= keyedInput.nextInt();
                    newNum=userNum;
                     for (int i = 1; i < userPower ; i = i + 1)

                    {
                       newNum = newNum*userNum;
                    }System.out.println(newNum); 

            }
        }


    }  while (choice != 4); 
    
}}
