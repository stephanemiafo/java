

/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_GetInfo
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-07
    Purpose:	The purpose of this program is to collect 4 pieces of information from the user and print
    a test message with them.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/


import java.util.Scanner;

public class PSK_CPT_189_01_GetInfo {
    public static void main(String[] args) {
        // Create a scanner object to get user input.
        Scanner scnMyKbd = new Scanner(System.in);

        // Gathering user's input.
        System.out.print("Please enter your name: ");
        String strUserName = scnMyKbd.nextLine();

        System.out.print("Please enter your age: ");
        int intUserAge = scnMyKbd.nextInt(); // nextInt will not use the "\n"
        scnMyKbd.nextLine(); // This line will then fix the "\n" issue.

        System.out.print("Please enter the name of your college: ");
        String strUserCollege = scnMyKbd.nextLine();

        System.out.print("Please enter your pet'name: ");
        String strUserPetName = scnMyKbd.nextLine();

        // Format and print the output with fixed width (50 characters)
        System.out.println("\tHello, my name is " + strUserName + " and I am " + intUserAge + " years");
        System.out.println("\told. I'm enjoying my time at " + strUserCollege + ", though");
        System.out.println("\tI missed my pet " + strUserPetName + " very much!");

        scnMyKbd.close();

    }
}
