/*
----------------------------------------------------------------------------------------------------------
    Name:		PhoneNumberGenerator
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a code that creates and prints a random phone 
    number of the form XXX–XXX–XXXX. The first three digits cannot contain an 8 or 9, and the second set 
    of three digits is not greater than 655.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-19	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

// import java.util.Random;


// public class PhoneNumberGenerator {
//     public static void main(String[] args) {
//         System.out.println(generatePhoneNumber());
//     }

//     /**
//      * Generates a random phone number of the form XXX-XXX-XXXX.
//      * The first three digits do not contain 8 or 9, and the second set of three digits is not greater than 655.
//      *
//      * @return A random phone number as a string.
//      */
//     public static String generatePhoneNumber() {
//         Random random = new Random();

//         // Generate the first three digits (0-7)
//         int firstDigit = random.nextInt(7) + 1; // Ensure the first digit is not 0
//         int secondDigit = random.nextInt(8);
//         int thirdDigit = random.nextInt(8);

//         // Generate the second three digits (0-655)
//         int secondThreeDigits = random.nextInt(656);

//         // Generate the last four digits
//         int lastFourDigits = random.nextInt(10000);

//         // Format the phone number
//         return String.format("%d%d%d-%03d-%04d", firstDigit, secondDigit, thirdDigit, secondThreeDigits, lastFourDigits);
//     }
// }



import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        System.out.println(generatePhoneNumber());
    }

    public static String generatePhoneNumber() {
        Random random = new Random();

        // First three digits
        // If chosen, the next line will allow the first digit to possibly be zero.
        int firstDigit = random.nextInt(8); // Range from 0 - 7
        
        // int firstDigit = random.nextInt(7) + 1; // NextInt(7) is 0 - 6, with +1 it shift
        // the range from 1 - 7 making sure the first digit will not be zero
        int secondDigit = random.nextInt(8); // Range from 0 - 7
        int thirdDigit = random.nextInt(8); // Range from 0 - 7

        // Second three digits
        int secondThreeDigits = random.nextInt(656); //Range from 0 - 655

        // Last four digits
        int lastFourDigits = random.nextInt(10000); // Range from 0 - 9999

        // Format phone number
        return firstDigit + "" + secondDigit + "" + thirdDigit + "-" + String.format("%03d", 
                secondThreeDigits) + "-" + String.format("%04d", lastFourDigits); // + "" will avoid addition of integer 
                // instead of concatenation.
    }
}