
/*
----------------------------------------------------------------------------------------------------------
    Name:		UsernameGenerator
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is collect a user's first and last name to generate a username 
    in the format: the first initial of the first name, the first five letters of the last name, and a 
    random number between 10 and 99.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-19	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
package PSK_Examples;

import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner scnMyKbd = new Scanner(System.in); // Create a scanner object to collect user input.
        Random rdmMyRdmObject = new Random(); // Create an instance of the random class.

        // Prompt and read first and last name
        System.out.print("Enter your first name: ");
        String strFirstName = scnMyKbd.nextLine();

        System.out.print("Enter your last name: ");
        String strLastName = scnMyKbd.nextLine();

        // Generate the username
        char chrFirstInitial = strFirstName.charAt(0); // Extract the first letter of the first name.
        // Extract the first 5 characters of the last name.
        String strLastNamePart = strLastName.substring(0, 5); 
        int intRandomNumber = rdmMyRdmObject.nextInt(90) + 10; // Generates a number between 10 and 99

        // Print the generated username
        String strUserName = chrFirstInitial + strLastNamePart + intRandomNumber;
        System.out.println("Generated Username: " + strUserName);

        scnMyKbd.close();
    }
    
}
