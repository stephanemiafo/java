
/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_Average
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-07
    Purpose:	The purpose of this program is to read 3 integers from keyboard and compute their average.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class PSK_CPT_189_01_Average {

    public static void main(String[] args) {
        Scanner scnMyKbd = new Scanner(System.in); // Create a scanner object to get keyboard input.
        System.out.print("Please enter your first integer: ");
        int intMyFirstNum = scnMyKbd.nextInt(); // Get the first integer and store it in a variable.
        
        System.out.print("Please enter your second integer: ");
        int intMySecNum = scnMyKbd.nextInt(); // Get the second integer and store it in a variable.

        System.out.print("Please enter your third integer: ");
        int intMyThirdNum = scnMyKbd.nextInt();

        double average = (intMyFirstNum + intMySecNum + intMyThirdNum) / 3.0; //3.0 for floating division
         
        // Output the result with 2 decimal places
        System.out.printf("The average is: %.2f\n", average);

        scnMyKbd.close();   // Close the scanner

    }
}