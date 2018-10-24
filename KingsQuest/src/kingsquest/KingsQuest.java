/*
Omar Sayyed
Choose your own Adventure program
October 23rd 2018
 */

package kingsquest;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class KingsQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
        //define variables
        String A, B, C, answer;
        //ask user if they want to play
        System.out.println("You have been selected to become the king's best knight, but first you must complete a quest. ");
        System.out.println ("Do you accept? A) yes B) no");
        answer = keyedInput.nextLine ();
        //start game
        if (answer.equals ("A"))
        {
            System.out.println("You must first choose a horse."); 
            System.out.println("Do you select: A) White horse B) Black horse ");
                answer = keyedInput.nextLine ();
                if (answer.equals ("A")) {
                    System.out.println("This horse has anger issues and he kicks you to death.");
                    System.out.println("You have failed.");
                }
                if (answer.equals ("B")) {
                    System.out.println("Good job, this is the kings finest stallion. Next you must choose which gate you would like to leave from.");
                    System.out.println("Do you leave from the: A) East gate B) West Gate ");    
                    answer = keyedInput.nextLine ();
                        if (answer.equals ("A")) {
                            System.out.println("The sun rising in the east causes your black stallion to die from overheating, you must now continue on foot. ");
                            System.out.println("You have been walking for three days, and a deadly massive chinchilla apears on the trail.");
                            System.out.println("Do you: A) Kill it with your sword B) Ignore it C) Sing U Can't Touch This");
                                answer = keyedInput.nextLine ();
                                if (answer.equals ("A"))
                                {
                                    System.out.println("It gets mad and breathes fire, melting you and your internal organs.");
                                }
                                else if (answer.equals ("B"))
                                {
                                    System.out.println("It gets mad and breathes fire, melting you and your internal organs.");
                                } 
                                else if (answer.equals ("C"))
                                        {
                                            System.out.println("it becomes very happy and allows you to pass. ");
                                            System.out.println("you are led to a castle with the king's sick daughter");
                                            System.out.println("sorry, you have failed, you need medicine to cure her");
                                        }
                        }
                       
                         else if (answer.equals ("B"))
                        {
                            System.out.println("There is no danger present here, you continue upon your horse, to find a small village. You have three gold coins, six silver and 2 bronze.");
                            System.out.println("Do you: A) Carry on B) Go to the resteraunt C) Enter the small shop");
                            answer = keyedInput.nextLine ();
                                if (answer.equals ("A"))
                                {
                                    System.out.println("You carry on, but die of thirst because the next villiage was 4 days away. ");
                                }
                                else if (answer.equals ("B"))
                                {
                                    System.out.println("You go to a cheap chinese place. you recieve food poisoning and die. ");     
                                }
                                else if (answer.equals ("C"))
                                { 
                                    System.out.println("inside the shop you find a protein bar for 1 silver, a chocolate bar for 1 bronze, and medecine for 2 silver. ");
                                    System.out.println("Do you buy: A) Protein bar B) Medicine C) Chocolate   ");
                                    answer = keyedInput.nextLine ();
                                    if (answer.equals ("A"))
                                    {
                                        System.out.println("You have purchased the last protein bar in the town. A body builder enters the shop and wants it. ");
                                        System.out.println("Do you A) sell it to him B) Give it to him C) Fight him");
                                            answer = keyedInput.nextLine ();
                                            if (answer.equals ("A")){
                                                System.out.println("He agrees and buys it from you, you go back to the store and purchase the medicine. ");
                                                System.out.println("You carry on and reach a small castle. The princess is in there sick and dying. You give her the medicine and she survives.");
                                                System.out.println("Congrats, you have won!");
                                            }
                                            else if (answer.equals ("B")){
                                                System.out.println("He becomes happy, but you run out of money and die.");
                                                System.out.println("You have failed.");
                                            }
                                            else if (answer.equals ("C")){
                                                System.out.println("He crushes your skull with just one of his hands. He takes the bloodied protein bar and eats it.");
                                                System.out.println("You have failed.");
                                            }
                                        
                                            
                                }  
                                else if (answer.equals ("B"))  {  
                                    System.out.println("You carry on and reach a small castle. The princess is in there sick and dying. You give her the medicine and she survives.");
                                    System.out.println("Congrats, you have won!");
                                }
                                else if (answer.equals ("C")) {
                                    System.out.println("You get a severe illness and die a slow painful death.");
                                    System.out.println("You have failed.");
                            }
                        }   
                        }
                else if (answer.equals ("A"))
                {
                    System.out.println("The white horse has anger issues and kicks you in the chest at full force, making your heart explode. You have failed. ");
                }
                
        }
        }
    else if (answer.equals ("B"))
    {
        System.out.println("You have been removed from your position and sentanced to be hanged for treason.");
    }
    
}}
