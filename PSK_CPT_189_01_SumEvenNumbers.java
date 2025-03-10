/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_SumEvenNumbers
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-03-07
    Purpose:	The purpose of this program is to write a program that reads an integer value and 
    prints the sum of all even integers between 2 and the input value, inclusive. In this case 2 is 
    also inclusive.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-03-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import java.util.Scanner;

public class PSK_CPT_189_01_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scnMyKbd = new Scanner(System.in); // Create a scanner object to get keyboard input.
        
        // Prompt the user for input
        System.out.print("Enter an integer value greater or equal to 2: ");
        int intNumber = scnMyKbd.nextInt();

        // Validate the input value
        if (intNumber < 2) {
            System.out.println("Error: Input value must be at least 2.");
        } else {
            int intSumEvenNum = 0;
            for (int i = 2; i <= intNumber; i += 2) { // Iterate through even numbers
                intSumEvenNum += i;
            }
            System.out.println("Sum of even numbers between 2 and " + intNumber + " (inclusive) is: " + intSumEvenNum);
        }

        scnMyKbd.close(); // Close scanner to avoid memory leaks
    }
    
}
