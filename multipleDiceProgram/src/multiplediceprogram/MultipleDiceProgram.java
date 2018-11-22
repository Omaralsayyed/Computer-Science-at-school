/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplediceprogram;

import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class MultipleDiceProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int totalRolls = 0;
        int diceRoll1 = 0;
        int diceRoll2 = 0;
        int diceNum1 = 0;
        int diceNum2 = 0;
        int score = 0;
        boolean play = true;
        while (play == true) {

            System.out.println("Hello, welcome to the best dice guessing game ever!"
                    + "\n Please enter 1 to roll the dice "
                    + "\n if you would like to exit this game enter 2");

            int choice = keyedInput.nextInt();

            if (choice == 1) {
                diceGame();
            } else if (choice == 2) {
                play = false;

            }
        }
    }
    

    public static void diceGame() {

        int score = 0;
        int diceRoll1 = (int) Math.round(Math.random() * 5 + 1);
        int diceNum1.setText(String.valueOf(diceRoll1));
        int diceRoll2 = (int) Math.round(Math.random() * 5 + 1);
        int diceNum2.setText(String.valueOf(diceRoll2));

        if (diceNum1 == 1 && diceNum2 == 1) {
            score - =10;
        }else if (diceNum1 == diceNum2){
            score + =5;
        } 
    }

}
