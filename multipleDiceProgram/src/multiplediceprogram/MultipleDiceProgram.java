/*
 *Omar Sayyed
U2 A6 
 */
package multiplediceprogram;

import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class MultipleDiceProgram {

    /**
     *
     */
    public static int score;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        System.out.println("Hello, welcome to the best dice guessing game ever!"
                + "\n If you roll an even number, you will get 1 added to your score. "
                + "\n If you roll an odd number, you will get 1 taken away from your score. "
                + "\n if both of the dice are the same you will get 5 added to your score."
                + "\n If you roll snake eyes (two ones) you will get 10 taken away from your score. ");
        boolean play = true;
        while (play == true) {

            System.out.println(""
                    + "\n Please enter 1 to roll the dice "
                    + "\n if you would like to exit this game enter 2");

            int choice = keyedInput.nextInt();

            if (choice == 1) {
                
                System.out.println("your score is" + (diceGame(score)));
            } else if (choice == 2) {
                play = false;

            }
        }
    }
    

    public static int diceGame(int score) {

      //roll first dice
        int diceRoll1 = (int) Math.round(Math.random() * 5 + 1);
      //roll second dice
        int diceRoll2 = (int) Math.round(Math.random() * 5 + 1);
      //add dice values together  
        int total=diceRoll1 + diceRoll2;
        
        System.out.println("1st dice roll number is" + diceRoll1);
        System.out.println("2nd dice roll number is" + diceRoll2);

        //decide user's score
        //if user rolls two 1s 
        if (diceRoll1 == 1 && diceRoll2 == 1) {
            score -=10;
        //if user rolls the same number
        }else if (diceRoll1 == diceRoll2){
            score +=5;
        //if user rolls even number
        } else if ((total %2)==0) {
            score +=1;
        //if user rolls odd
        }else {
            score -=1;
        }
        
        return (score);        
    

}
}
