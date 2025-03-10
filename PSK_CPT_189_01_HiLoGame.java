
/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_HiLoGame
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-03-01
    Purpose:	The purpose of this program is to write a HiLo guessing game where a random number 
    is picked by the program and the user is prompted to guess it. On each guess, the program will hint 
    the user if the user's picked number is higher or lower than the random number. Once the user picked 
    the right number, the program will report back to the user with the correct number and the number 
    of guesses it took the user to get the right number.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-03-01	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import java.util.Random;
import java.util.Scanner;

public class PSK_CPT_189_01_HiLoGame {
    public static void main(String[] args) { 
        Scanner scnMyKbd = new Scanner(System.in);  // Create a Scanner object for user input
        Random rndNumber = new Random();      // Create a Random object to generate random numbers
        
        boolean blnPlayAgain = true;  // Create a boolean to control the while loop

        while (blnPlayAgain) {
            // Generate a random number between 1 and 100
            //+1 will shift the range from 1 to 100 (inclusive).
            int intNumberToGuess = rndNumber.nextInt(100) + 1; 
            int intGuess = 0;    // Variable to store user's guess
            int intGuessCount = 0;    // Counter to keep track of number of guesses
            
            System.out.println("Welcome to the Hi-Lo Guessing Game!");
            System.out.println("I have picked a number between 1 and 100.");
            System.out.println("Try to guess it! Type '0' to quit at any time.");
            
            // Continue looping until the user guesses the number or decides to quit
            while (intGuess != intNumberToGuess) {
                System.out.print("Enter your guess: ");
                intGuess = scnMyKbd.nextInt();  //Read user input
                
                //Check if the user wants to quit (sentinel value)
                if (intGuess == 0) {
                    System.out.println("You've decided to quit. The number was: " + intNumberToGuess);
                    break;   //Exit the inner loop
                }
                
                intGuessCount++; //Increment guess count
                
                // Compare the guess with the target number
                if (intGuess < intNumberToGuess) {
                    System.out.println("Your guess is too low. Try again!");
                } else if (intGuess > intNumberToGuess) {
                    System.out.println("Your guess is too high. Try again!");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                    System.out.println("It took you " + intGuessCount + " guesses.");
                }
            }

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String strPlayResponse = scnMyKbd.next();  // Read user input
            
            if (strPlayResponse.equalsIgnoreCase("no")) {
                blnPlayAgain = false;  // Set flag to false to exit the loop
                System.out.println("Thank you for playing!");
            }
        }
    
        scnMyKbd.close(); // Close the scanner
    } 
    
}
