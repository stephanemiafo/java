/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_CheckerboardApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-03-07
    Purpose:	The purpose of this program is to write a JavaFX application that displays an 8*8 
                checkerboard with 64 squares, alternating black and red.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-03-07	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class PSK_CPT_189_01_CheckerBoardApp extends Application {
    private static final int intBOARD_SIZE = 8;  // 8x8 board
    private static final int intSQUARE_SIZE = 60; // Each square is 60x60 pixels

    @Override
    public void start(Stage primaryStage) {
        GridPane gdpnMyGridPane = new GridPane(); // Create a GridPane layout

        // Loop to create the checkerboard pattern
        for (int intRow = 0; intRow < intBOARD_SIZE; intRow++) {
            for (int intCol = 0; intCol < intBOARD_SIZE; intCol++) {
                Rectangle rectSquare = new Rectangle(intSQUARE_SIZE, intSQUARE_SIZE); // Create a square

                // Alternating colors (black & red)
                if ((intRow + intCol) % 2 == 0) {
                    rectSquare.setFill(Color.BLACK);  // Even sum: Black
                } else {
                    rectSquare.setFill(Color.RED);    // Odd sum: Red
                }

                gdpnMyGridPane.add(rectSquare, intCol, intRow); // Add the square to the grid
            }
        }

        Scene scnMyScene = new Scene(gdpnMyGridPane, intBOARD_SIZE * intSQUARE_SIZE, intBOARD_SIZE * intSQUARE_SIZE); // Create scene

        primaryStage.setTitle("Checkerboard"); // Set window title
        primaryStage.setScene(scnMyScene); // Set the scene
        primaryStage.show(); // Show the window
    }

    public static void main(String[] args) {
        launch(args); // Launch JavaFX application
    }
    
}
