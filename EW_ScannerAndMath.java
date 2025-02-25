/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_ScannerAndMath
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-03
    Purpose:	The purpose of this program is to demonstrate how to import and use the Scanner class to 
                get user input of different data types.  It demonstrates how to flush the keyboard buffer 
                after retrieving numeric values. It also demonstrates how to do some basic math operations
                including how to handle issues of desired precision in output.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-03	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;                               // import is used to use code YOU didn't write!

public class EW_ScannerAndMath {                  // has to match the file name.
    public static void main(String[] args) throws Exception { // Void means that the main method will
        // not return anything.
        Scanner scnMyKbd = new Scanner(System.in);      // creates a scanner object to get keyboard input
        System.out.println("Please enter your name: ");     // prompt the user for their name
        String strYourName = scnMyKbd.nextLine();       // get the user's name and put it in the variable
        System.out.println("Well!  Hello there, " + strYourName);   // say hello to the user

        /* 
         * In this next block of code, we will prompt the user to enter variable of different types.
         * 
         * NOTE: When getting numeric values from the user, the carriage return is LEFT IN THE BUFFER!
         * That means that it must be flushed out before you can get any new non-numeric input!
        */
        System.out.print("Please enter your height (in inches): ");
        int intHeightInInches = scnMyKbd.nextInt();     // get a numeric - CR is STILL IN BUFFER!
        scnMyKbd.nextLine();                            // this is required to flush the CR from buffer
        System.out.print("Also, please tell me your favorite color: ");
        String strFavColor = scnMyKbd.nextLine();
        System.out.println("Cool!  So, you are " + intHeightInInches + " inches tall and your " +
                    "favorite color is " + strFavColor + "!");      // text is joined with + operator
       
        /*
         * In this next block of code, we will do some math using the numeric values we have collected.
         * We will see the difference between integer math and floating point math.
        */ 
        System.out.println("-".repeat(80));     // prints a line of 80 dashes in the output
        
        // This next line shows INTEGER division.  Both operands are integers so the answer is an integer
        int intHeightInFeetOnly = intHeightInInches / 12;
        System.out.println("Well, by my calculations, you are " + intHeightInFeetOnly + " feet tall!");
        float fltHeightInFeetWithFraction = intHeightInInches / 12f;  // the f makes the 12 a float!
        System.out.println("However, you are more accurately just " + 
            String.format("%.02f", fltHeightInFeetWithFraction) + // format to 2 decimal places
            " feet tall.");
        System.out.println("But that isn't how we normally refer to people's heights!");
        int intLeftoverInches = intHeightInInches % 12;     // the % operator delivers the remainder!
        System.out.println("We would normally say that you are " + intHeightInFeetOnly + " feet " +
                    "and " + intLeftoverInches + " inches tall.");
        System.out.println(("-".repeat(80)));    
        scnMyKbd.close();                                // this closes the keyboard object

        //------------------------------------------------------------------------------------------------------------
    //     String userInfo;
    //     String firstName;
    //     String lastName;
    //     int userAge;

    //     userInfo = "Amy smith 19";

    //     // Create new scanner object with String.
    //     Scanner inSS = new Scanner(userInfo);

    //     // Parse name and age values from string.
    //     firstName = inSS.next();
    //     lastName = inSS.next();
    //     userAge = inSS.nextInt();

    //     System.out.println(firstName + " " + lastName + " " + userAge);
    //     inSS.close();

    //---------------------------------------------------------------------------------------
    // // Output formatting for Strings
    // System.out.printf("Dog age in human years (dogyears.com)\n\n");
    // System.out.printf("-------------------------\n");

    // // set num char for each column, left aligned
    // System.out.printf("%-10s | %-12s\n", "Dog age", "Human age");
    // System.out.printf("-------------------------\n");

    // // set num char for each column, first col left aligned
    // System.out.printf("%-10s | %12s\n", "2 months", "14 months");
    // System.out.printf("%-10s | %12s\n", "6 months", "5 years");
    // System.out.printf("%-10s | %12s\n", "8 months", "9 years");
    // System.out.printf("%-10s | %12s\n", "1 year", "15 years");
    // System.out.printf("-------------------------\n");
    // System.out.printf("%-15s | %15s\n", "5 years", "20 years");
    }
}