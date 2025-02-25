/*
----------------------------------------------------------------------------------------------------------
    Name:		RandomCircleApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a JavaFX application that draws a circle with a 
    random radius in the range 50 to 150.
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
import java.util.Random;

public class RandomCircleApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Generate a random radius between 50 and 150
        Random rdmMyRdmObject = new Random();
        int intRadius = 50 + rdmMyRdmObject.nextInt(101); // 50 to 150 inclusive
        
        // Create a circle centered at (200, 200) with the random radius
        Circle cirCircle = new Circle(200, 200, intRadius); // Create circle object
        cirCircle.setFill(Color.BLUE); // Set the color of the circle to BLUE
        
        // Set up the pane to hold the circle
        Pane pnpane = new Pane();
        pnpane.getChildren().add(cirCircle);
        
        // Set the scene and stage
        Scene scnscene = new Scene(pnpane, 400, 400);
        primaryStage.setTitle("Circle with Radius: " + intRadius);  // Set window title
        primaryStage.setScene(scnscene);  // Set scene to stage
        primaryStage.show(); // Show the window
    }

    public static void main(String[] args) {
        launch(args); // Launch JavaFX application
    }
}
