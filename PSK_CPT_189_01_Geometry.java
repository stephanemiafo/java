
/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_Geometry
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-07
    Purpose:	The purpose of this program is to read an integer representing the length of a square’s 
    side, then prints the square’s perimeter and area.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class PSK_CPT_189_01_Geometry {
    public static void main(String[] args) {
        // Create a scanner object to collect user data from keyboard
        Scanner scnMyKbd = new Scanner(System.in);

        // Prompt user for the length of the square's side
        System.out.print("Please enter the length of the square's side: ");
        int sideLength = scnMyKbd.nextInt();

        // Calculate perimeter and area
        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        // Display the results with the units
        System.out.println("The perimeter of the square is: " + perimeter + " feet.");
        System.out.println("The area of the square is: " + area + " square feet.");

        // Close the scanner
        scnMyKbd.close();

    }
}
