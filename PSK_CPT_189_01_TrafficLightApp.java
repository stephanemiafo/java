/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_TrafficLightApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-28
    Purpose:	The purpose of this program is to write an application that displays the drawing of a 
    traffic light. This program allow the user to select the state of the light (stop, caution, or go) 
    from a set of radio buttons.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-28	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PSK_CPT_189_01_TrafficLightApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle to represent the traffic light box (background)
        Rectangle lightBox = new Rectangle(100, 250, Color.BLACK);
        lightBox.setArcWidth(20);  // Rounded corners
        lightBox.setArcHeight(20);

        // Create three circles representing the traffic light bulbs
        // Initially, they are all "dimmed" (darker colors)
        Circle redLight = new Circle(50, Color.DARKRED);
        Circle yellowLight = new Circle(50, Color.DARKGOLDENROD);
        Circle greenLight = new Circle(50, Color.DARKGREEN);

        // Create a VBox to arrange the three lights vertically
        VBox lightContainer = new VBox(20, redLight, yellowLight, greenLight);
        lightContainer.setAlignment(Pos.CENTER);  // Center them in the VBox

        // Group the traffic light components together
        VBox trafficLight = new VBox(lightBox);  // Add the black rectangle first
        trafficLight.getChildren().add(lightContainer);  // Then add the lights
        trafficLight.setAlignment(Pos.CENTER);

        // Create three radio buttons for selecting traffic light states
        RadioButton redButton = new RadioButton("Stop");       // Red light
        RadioButton yellowButton = new RadioButton("Caution"); // Yellow light
        RadioButton greenButton = new RadioButton("Go");       // Green light

        // Group radio buttons together so only one can be selected at a time
        ToggleGroup toggleGroup = new ToggleGroup();
        redButton.setToggleGroup(toggleGroup);
        yellowButton.setToggleGroup(toggleGroup);
        greenButton.setToggleGroup(toggleGroup);

        // Event handler for the "Stop" (Red) button
        redButton.setOnAction(e -> {
            redLight.setFill(Color.RED);         // Turn on the red light
            yellowLight.setFill(Color.DARKGOLDENROD); // Dim the yellow light
            greenLight.setFill(Color.DARKGREEN); // Dim the green light
        });

        // Event handler for the "Caution" (Yellow) button
        yellowButton.setOnAction(e -> {
            redLight.setFill(Color.DARKRED);     // Dim the red light
            yellowLight.setFill(Color.YELLOW);   // Turn on the yellow light
            greenLight.setFill(Color.DARKGREEN); // Dim the green light
        });

        // Event handler for the "Go" (Green) button
        greenButton.setOnAction(e -> {
            redLight.setFill(Color.DARKRED);     // Dim the red light
            yellowLight.setFill(Color.DARKGOLDENROD); // Dim the yellow light
            greenLight.setFill(Color.LIMEGREEN); // Turn on the green light
        });

        // Create an HBox to arrange the radio buttons horizontally
        HBox controls = new HBox(15, redButton, yellowButton, greenButton);
        controls.setAlignment(Pos.CENTER);

        // Create the main layout (VBox) and add the traffic light and controls
        VBox root = new VBox(20, trafficLight, controls);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: lightgray;"); // Set background color

        // Create the scene with a fixed size
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Traffic Light Simulation"); // Set the window title
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the window
    }

    public static void main(String[] args) {
        launch(args); 
    }
}