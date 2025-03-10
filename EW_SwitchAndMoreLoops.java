package PSK_Examples;

import java.util.Random;
import java.util.Scanner;

public class EW_SwitchAndMoreLoops {
    public static Scanner scnKbd = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         * This first section will demonstrate using a do loop to process up to 100 random numbers
         * between 0 and 100, but will stop processing as soon as the random number picked is a zero.
         * This also demonstrates the ternary operator to determine when to print on a new line.
         */
        Random rndGenerator = new Random();
        int intCurrentRandom = -1;              // initialized this sentinel outside of the acceptable range
        int intLoopCounter = 0;                 // a counter for every iteration of the loop
        System.out.println("-".repeat(80));
        System.out.println("This first part of the program will attempt to generate up to 100 random numbers.");
        System.out.println("  Since it is in a \"do-while\" loop, it will definitely run at least one time.");
        System.out.println("  However, as soon as the random number chosen is a zero, the program will end\n" +
                "  this section of processing.  If no zero is ever randomly picked, then all 100\n" +
                "  numbers will be selected.  Here come the numbers:");
        do {                                    // this do loop will always execute at least once
            intLoopCounter++;                   // increments the loop counter every time in the loop
            intCurrentRandom = rndGenerator.nextInt(101);
            System.out.print("#" + intLoopCounter + "=" + intCurrentRandom + ", " );    // all on same line
            System.out.print((intLoopCounter % 10) == 0 ? "\n" : "");       // prints a new line every 10th item
        } while (intCurrentRandom != 0 && intLoopCounter < 100);    // the test happens at the end
        System.out.println();                   // force a blank line
        System.out.println("At the end of this section, the loop counter was " + intLoopCounter + 
                "\n  and the last random number selected was " + intCurrentRandom + ".");
        System.out.println("This loop ended because " +
                (intCurrentRandom == 0 ? "the Zero Sentinel was randomly chosen!" : "the 100 max numbers were chosen."));
        waitForUser();

        /*
         * For this next section, the program will use a for loop to generate 100 random numbers like before.
         * This time, however, the program will use a switch to count the numbers within specific ranges and
         * report the final counts.
         */
        int intCount0to25 = 0, intCount26to50 = 0, intCount51to75 = 0, intCount76to100 = 0;  // initialize counters
        int intWhichQuarter = 0;                        // used to hold which quarter the random number is in
        System.out.println("In this section, a \"for loop\" will be used to generate 100 random numbers.");
        System.out.println("  Additionally, a \"switch\" block will be used to count the numbers in each group of 25.");
        for (int i=1; i<=100; i++){     // in non-nested for loops, non-standard variable names can be used
            intCurrentRandom = rndGenerator.nextInt(101);
            System.out.print("#" + i + "=" + intCurrentRandom + ", " );     // all on same line
            System.out.print((intLoopCounter % 10) == 0 ? "\n" : "");       // prints a new line every 10th item
            if(intCurrentRandom <=25){          // this if block is used to determine which quarter each number is in
                intWhichQuarter = 1;
            } else if (intCurrentRandom <=50){
                intWhichQuarter = 2;
            } else if (intCurrentRandom <=75){
                intWhichQuarter = 3;
            } else {
                intWhichQuarter = 4;
            } 
            switch(intWhichQuarter){    // although this switch works, can you determine why it is actually unnecessary?
                case 1:
                    intCount0to25++;
                    break;
                case 2:
                    intCount26to50++;
                    break;
                case 3:
                    intCount51to75++;
                    break;
                case 4:
                    intCount76to100++;
                    break;
            }
        }
        System.out.println();
        System.out.println("The final counts are as follows:");
        System.out.println("  Count in first quarter: " + intCount0to25);
        System.out.println("  Count in second quarter: " + intCount26to50);
        System.out.println("  Count in third quarter: " + intCount51to75);
        System.out.println("  Count in fourth quarter: " + intCount76to100);
        System.out.println("The sum of all of these counts is: " + 
                (intCount0to25 + intCount26to50 + intCount51to75 + intCount76to100));
        waitForUser();
        System.out.println("Finally, review the code and discover why the switch block is actually unnecessary!");
    }

    public static void waitForUser(){
        System.out.print("Please press  to continue...");
        scnKbd.nextLine();
        System.out.println("-".repeat(80));
    }
}
