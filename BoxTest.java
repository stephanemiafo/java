package PSK_Examples;

import java.util.Scanner;

public class BoxTest {

    public static Scanner scnKbd = new Scanner(System.in);   // defined outside of the methods to be reusable
    public static void main(String[] args) {
        //Creating Boxes objects and not creating a box.
        System.out.println("Welcome to my box store.");
        waitForUser();      // Avoid code duplication
        Box firstBox = new Box();  // No Box
        Box secondBox = new Box(10.25f, 45.365f, 11.25f); // Create an empty box.
        Box thirdBox = new Box(12.01f, 254.0245f, 456.0145f); // Create a full box.
        System.out.println("These are the boxes (including the no box)");
        System.out.println(firstBox);
        System.out.println(secondBox);
        System.out.println(thirdBox);
        waitForUser();

        //Use mutator to create other boxes.
        System.out.println("We will use setters to update the boxes' dimensions");
        secondBox.setHeight(23.365f);
        secondBox.setWidth(48.26f);
        secondBox.setDepth(32.256f);
        secondBox.setFull(true);
        System.out.println("After updating the 2nd box, let us look at it.");
        System.out.println(secondBox);
        waitForUser();

        //Use getters to get the individual properties
        System.out.println("Finally let's imagine that the customer wants to know the dimensions\n" + 
                "of the box");
        System.out.println("The dimensions of the box are: \nHeight " + secondBox.getHeight() + 
                "\nWidth: " + secondBox.getWidth() + "\nDepth: " + secondBox.getDepth() + 
                "\nand it is " + secondBox.getFull() + " that the box is full.");
    }
    

    public static void waitForUser() {
        System.out.println("-".repeat(80)); //Drawin a line with 80 dashes
        System.out.println("press [the enter key] to continue...");
        scnKbd.nextLine();

    }
}
