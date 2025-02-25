/*
----------------------------------------------------------------------------------------------------------
    Name:		ClosestWholeNumbers
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a code that reads a floating point value (double) 
    and prints the closest whole numbers less than and greater than that value.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-19	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import java.util.Scanner;

public class ClosestWholeNumbers {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        // Find the closest whole number less than the input
        int floorValue = (int) Math.floor(number);

        // Find the closest whole number greater than the input
        int ceilingValue = (int) Math.ceil(number);

        // Print the results with appropriate descriptors
        System.out.println("The closest whole number less than " + number + " is: " + floorValue);
        System.out.println("The closest whole number greater than " + number + " is: " + ceilingValue);

        // Close the scanner
        scanner.close();
    }
}
