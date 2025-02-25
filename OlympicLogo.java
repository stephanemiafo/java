/*
----------------------------------------------------------------------------------------------------------
    Name:		OlympicLogo
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a JavaFX application that displays the Olympic 
    logo.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-19	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class OlympicLogo extends Application { // Extend Application class for JavaFX
    @Override
    public void start(Stage primaryStage) { // Start method to set up the UI
        Pane pnpane = new Pane(); // Create a pane to hold the circles

        // Define circle radius and spacing between them
        double dblradius = 50;
        double dblspacing = 110; // Horizontal spacing between circles

        // Create the Olympic rings
        // Blue circle (first row, leftmost)
        Circle cirblue = new Circle(100, 100, dblradius, Color.TRANSPARENT); // Center (100,100), transparent fill
        cirblue.setStroke(Color.BLUE); // Set stroke color to blue
        cirblue.setStrokeWidth(5); // Set line thickness

        // Black circle (first row, middle)
        Circle cirblack = new Circle(100 + dblspacing, 100, dblradius, Color.TRANSPARENT);
        cirblack.setStroke(Color.BLACK); // Set stroke color to black
        cirblack.setStrokeWidth(5); // Set line thickness

        // Red circle (first row, rightmost)
        Circle cirred = new Circle(100 + 2 * dblspacing, 100, dblradius, Color.TRANSPARENT);
        cirred.setStroke(Color.RED); // Set stroke color to red
        cirred.setStrokeWidth(5); // Set line thickness

        // Yellow circle (second row, left)
        Circle ciryellow = new Circle(100 + dblspacing / 2, 100 + 60, dblradius, Color.TRANSPARENT);
        ciryellow.setStroke(Color.YELLOW);// Set stroke color to yellow
        ciryellow.setStrokeWidth(5); // Set line thickness

        // Green circle (second row, right)
        Circle cirgreen = new Circle(100 + dblspacing + dblspacing / 2, 100 + 60, dblradius, Color.TRANSPARENT);
        cirgreen.setStroke(Color.GREEN); // Set stroke color to green
        cirgreen.setStrokeWidth(5); // Set line thickness

        // Add all circles to the pane
        pnpane.getChildren().addAll(cirblue, cirblack, cirred, ciryellow, cirgreen);
        
        // Create a scene with the pane and set window size
        Scene scnscene = new Scene(pnpane, 400, 250);
        primaryStage.setTitle("Olympic Logo"); // Set window title
        primaryStage.setScene(scnscene); // Set scene to stage
        primaryStage.show(); // Show the window
        
    }

    public static void main(String[] args) {
        launch(args); // Launch JavaFX application
    }
}