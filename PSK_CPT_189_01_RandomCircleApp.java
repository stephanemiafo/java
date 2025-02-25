/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_RandomCircleApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-22
    Purpose:	The purpose of this program is to create a JavaFX application that presents a button and a
    circle. Every time the button is pushed, the circle should be moved to a new random location within 
    the window.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

public class PSK_CPT_189_01_RandomCircleApp extends Application {
    private static final int WIDTH = 400; // Window width
    private static final int HEIGHT = 300; // Window height
    private static final int CIRCLE_RADIUS = 30; // Circle radius

    @Override
    public void start(Stage primaryStage) {
        Random rdnRandOject = new Random();

        // Create a Pane layout
        Pane pnPane = new Pane();

        // Create a Circle
        Circle cirNewCircle = new Circle(CIRCLE_RADIUS, Color.BLUE);
        cirNewCircle.setCenterX(WIDTH / 2.0); // Initial X position
        cirNewCircle.setCenterY(HEIGHT / 2.0); // Initial Y position

        // Create a Button
        Button btonMoveButton = new Button("Move Circle");
        btonMoveButton.setLayoutX(WIDTH / 2.0 - 40); // Center the button
        btonMoveButton.setLayoutY(HEIGHT - 50); // Keep button at the bottom

        // Move circle on button click
        btonMoveButton.setOnAction(e -> {
            // Generate random positions ensuring the circle stays fully inside
            double dblNewX = CIRCLE_RADIUS + rdnRandOject.nextDouble() * (WIDTH - 2 * CIRCLE_RADIUS);
            double dblNewY = CIRCLE_RADIUS + rdnRandOject.nextDouble() * (HEIGHT - 2 * CIRCLE_RADIUS - 50); // Keep button visible

            cirNewCircle.setCenterX(dblNewX);
            cirNewCircle.setCenterY(dblNewY);
        });

        // Add elements to the pane
        pnPane.getChildren().addAll(cirNewCircle, btonMoveButton);

        // Create the Scene
        Scene scnScene = new Scene(pnPane, WIDTH, HEIGHT);

        // Setup Stage
        primaryStage.setTitle("Random Circle Mover");
        primaryStage.setScene(scnScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
