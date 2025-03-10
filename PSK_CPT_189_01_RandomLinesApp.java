/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_RandomLinesApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-03-07
    Purpose:	The purpose of this program is to write a JavaFX application that draws 20 horizontal, 
            evenly spaced parallel lines of random length.

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
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;

public class PSK_CPT_189_01_RandomLinesApp extends Application {
    private static final int intWIDTH = 600;  // Window width
    private static final int intHEIGHT = 400; // Window height
    private static final int intLINE_COUNT = 20; // Number of lines
    private static final int intLINE_SPACING = intHEIGHT / (intLINE_COUNT + 1); // Even spacing
    private static final int intMIN_LENGTH = 50; // Minimum length of a line
    private static final int intMAX_LENGTH = 550; // Maximum length of a line
    private static final int intSTART_X = 20; // Fixed starting X position

    @Override
    public void start(Stage primaryStage) {
        Canvas cvsCanvas = new Canvas(intWIDTH, intHEIGHT); // Create a canvas
        GraphicsContext gcGraphCont = cvsCanvas.getGraphicsContext2D(); // Get graphics context

        drawLines(gcGraphCont); // Call method to draw random lines

        StackPane stkpnRoot = new StackPane(cvsCanvas); // Pane to hold the canvas
        Scene scnScene = new Scene(stkpnRoot, intWIDTH, intHEIGHT); // Create the scene

        primaryStage.setTitle("Random Parallel Lines"); // Set window title
        primaryStage.setScene(scnScene); // Set scene
        primaryStage.show(); // Display window
    }

    private void drawLines(GraphicsContext gcGraphCont) {
        Random randRandomNum = new Random(); // Create a random number generator

        for (int i = 1; i <= intLINE_COUNT; i++) { // Loop to create lines
            int intLength = randRandomNum.nextInt(intMAX_LENGTH - intMIN_LENGTH + 1) + intMIN_LENGTH; // Random length
            int intYPos = i * intLINE_SPACING; // Calculate Y position based on spacing

           gcGraphCont.strokeLine(intSTART_X, intYPos, intSTART_X + intLength, intYPos); // Draw the line
        }
    }

    public static void main(String[] args) {
        launch(args); // Launch JavaFX application
    }
    
}
