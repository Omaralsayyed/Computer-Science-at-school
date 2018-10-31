/*
 Omar Sayyed
October 31st 2018
Asks user for number of marks, then collects marks and ouputs an average along with a letter grade
 */

package avgcalculatorarraylist;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class AvgCalculatorAnyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     	Scanner input = new Scanner(System.in);

        //define variables
        int numMarks=0;
        int total = 0;
            //ask user for number of marks
            System.out.println("How many marks do you want to enter?:");
            
                //get number of marks
                numMarks = input.nextInt();
                System.out.println("You want to enter " + numMarks +" marks.");
                  int [ ] numbers = new int [numMarks];
                  
                    //Get marks
                    System.out.println("Enter " + numMarks +  " marks and they will be averaged:");
                    for (int i = 0; i <numMarks; i = i + 1)
                    {
                       numbers[i] = input.nextInt();
                    }

                    //add them together
                    for (int i = 0; i <= numMarks-1; i = i + 1)
                    {
                         total = total + numbers[i];
                    }

                    // Calculate average
                    int average = total/numMarks;
                    //output average
                    System.out.println("Your average mark is: " + average);
                    
                     //tell user letter grade 
                        if (average < 50) {
                            System.out.println("You have failed");
                }   
                        else if (average <60)   {
                            System.out.println("You have a D");
                }
                        else if (average < 70){
                            System.out.println("You have a C");
                }
                        else if (average < 80){
                            System.out.println("You have a B");
                }
                        else if (average <= 100){
                            System.out.println("Congrats, you have an A");
                }


                    }
    
}
