
/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_SumDiffProd
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-07
    Purpose:	The purpose of this program is to read two floating point numbers from the user and 
    prints their sum, difference, and product.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class PSK_CPT_189_01_SumDiffProd {
    public static void main(String[] args) {
        Scanner scnMyKbd = new Scanner(System.in); // Create a scanner object to get keyboard input.

        // Prompt the user to enter the numbers.
        System.out.print("Please enter your first number: ");
        float fltFirstNum = scnMyKbd.nextFloat();

        System.out.print("Please enter your second number: ");
        float fltSecondNum = scnMyKbd.nextFloat();

        // Calculate the Sum of the two numbers
        float fltsummation = fltFirstNum + fltSecondNum;

        // Calculate the Difference of the two numbers
        float fltdifference = fltFirstNum - fltSecondNum;

        // Calculate the Product of the two numbers
        float fltproduct = fltFirstNum * fltSecondNum;

        System.out.printf("The sum of %.2f and %.2f is %.2f%n", fltFirstNum, fltSecondNum, fltsummation); //Keep 2 decimal places
        System.out.printf("The difference of %.2f and %.2f is %.2f%n",fltFirstNum, fltSecondNum, fltdifference); //Keep 2 decimal places
        System.out.printf("The product of %.2f and %.2f is %.2f%n",fltFirstNum, fltSecondNum, fltproduct);  //Keep 2 decimal places

        scnMyKbd.close();



    }
}
