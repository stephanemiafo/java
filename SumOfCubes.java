/*
----------------------------------------------------------------------------------------------------------
    Name:		SumOfCubes
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to compute the sum of the cube of two numbers collected
    from the user.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-19	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner scnMyKbd = new Scanner(System.in); // Create a scanner object to get keyboard input.

        // Prompt and read two integer values
        System.out.print("Enter the first integer: ");
        int intNum1 = scnMyKbd.nextInt(); // Get the first integer and store it in a variable.

        System.out.print("Enter the second integer: ");
        int intNum2 = scnMyKbd.nextInt(); // Get the second integer and store it in a variable.

        // Compute the sum of cubes
        int intSumOfCubes = (int)(Math.pow(intNum1, 3) + Math.pow(intNum2, 3));

        // Print the result
        System.out.println("The sum of cubes is: " + intSumOfCubes);

        scnMyKbd.close();
    }
}
