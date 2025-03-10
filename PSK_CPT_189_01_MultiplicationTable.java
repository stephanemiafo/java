/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_MultiplicationTable
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-03-07
    Purpose:	The purpose of this program is to write a program that produces a multiplication table, 
            showing the results of multiplying the integers 1 through 12 by themselves. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-03-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

public class PSK_CPT_189_01_MultiplicationTable {
    public static void main(String[] args) {
        int intSizeMultTable = 12; // Define the size of the multiplication table (1 to 12)

        // Print the header row (top numbers 1 to 12)
        System.out.print("    "); // Print initial spacing for alignment
        for (int i = 1; i <= intSizeMultTable; i++) {
            System.out.printf("%4d", i); // Print each number with width 4 for alignment
        }
        
        System.out.println(); // Move to the next line after the header row

        // Print the multiplication table
        for (int i = 1; i <= intSizeMultTable; i++) { // Outer loop for rows (1 to 12)
            System.out.printf("%4d", i); // Print row label (first column)
            
            for (int j = 1; j <= intSizeMultTable; j++) { // Inner loop for columns (1 to 12)
                System.out.printf("%4d", i * j); // Print the product of i and j with width 4
            }
            
            System.out.println(); // Move to the next row after printing all columns
        }
    }
}
