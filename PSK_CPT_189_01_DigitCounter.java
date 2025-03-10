/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_intDigitCounter
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-28
    Purpose:	The purpose of this program is to determine and print the number of odd, even, and zero 
    digits in an integer value read from the keyboard.

----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-28	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import java.util.Scanner;

public class PSK_CPT_189_01_DigitCounter {
    public static void main(String[] args) {
        Scanner scnMyKbd = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int intNumber = scnMyKbd.nextInt();  //Read user input
        scnMyKbd.close(); // Close scanner to prevent resource leaks

        // Make a copy of the number for processing
        int intCopyNumber = Math.abs(intNumber); // Use absolute value to handle negative intCopyNumbers

        int intEvenCount = 0, intOddCount = 0, intZeroCount = 0;

        // Handle special case when input is 0
        if (intCopyNumber == 0) {
            intZeroCount = 1;
        } else {
            // Process each digit
            while (intCopyNumber > 0) {
                int intDigit = intCopyNumber % 10; // Extract last intDigit

                if (intDigit == 0) {
                    intZeroCount++;
                } else if (intDigit % 2 == 0) {
                    intEvenCount++;
                } else {
                    intOddCount++;
                }

                intCopyNumber /= 10; // Remove last intDigit
            }
        }

        // Display results
        System.out.println("intCopyNumber of even intdigits: " + intEvenCount);
        System.out.println("intCopyNumber of odd intdigits: " + intOddCount);
        System.out.println("intCopyNumber of zero intdigits: " + intZeroCount);
    }
    
}
