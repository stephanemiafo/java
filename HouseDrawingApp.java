
/*
----------------------------------------------------------------------------------------------------------
    Name:		HouseDrawingApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a JavaFX application that draws a house with a 
    door and doorknob, windows, and a chimney
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
// import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HouseDrawingApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the shapes
        Pane pane = new Pane();

        // Draw the house body (rectangle)
        Rectangle house = new Rectangle(100, 200, 200, 150);
        house.setFill(Color.LIGHTBLUE);
        house.setStroke(Color.BLACK);
        
        // Draw the roof (triangle)
        Polygon roof = new Polygon();
        roof.getPoints().addAll(100.0, 200.0, 300.0, 200.0, 200.0, 100.0);
        roof.setFill(Color.DARKRED);
        roof.setStroke(Color.BLACK);

        // Draw the door (rectangle)
        Rectangle door = new Rectangle(170, 275, 60, 75);
        door.setFill(Color.BROWN);
        door.setStroke(Color.BLACK);

        // Draw the doorknob (circle)
        Circle doorknob = new Circle(220, 315, 5);
        doorknob.setFill(Color.GOLD);

        // Draw windows (rectangles)
        Rectangle window1 = new Rectangle(120, 225, 40, 40);
        window1.setFill(Color.WHITE);
        window1.setStroke(Color.BLACK);

        Rectangle window2 = new Rectangle(240, 225, 40, 40);
        window2.setFill(Color.WHITE);
        window2.setStroke(Color.BLACK);

        // Draw the chimney (rectangle)
        Rectangle chimney = new Rectangle(230, 120, 30, 50);
        chimney.setFill(Color.GRAY);
        chimney.setStroke(Color.BLACK);

        // Draw smoke (circles)
        Circle smoke1 = new Circle(245, 75, 10);
        smoke1.setFill(Color.GRAY);
        smoke1.setOpacity(0.6);

        Circle smoke2 = new Circle(260, 65, 12);
        smoke2.setFill(Color.GRAY);
        smoke2.setOpacity(0.6);

        Circle smoke3 = new Circle(270, 55, 14);
        smoke3.setFill(Color.GRAY);
        smoke3.setOpacity(0.6);

        // Draw clouds (circles)
        Circle cloud1 = new Circle(50, 50, 30);
        cloud1.setFill(Color.WHITE);
        cloud1.setOpacity(0.7);

        Circle cloud2 = new Circle(90, 40, 40);
        cloud2.setFill(Color.WHITE);
        cloud2.setOpacity(0.7);

        Circle cloud3 = new Circle(70, 30, 35);
        cloud3.setFill(Color.WHITE);
        cloud3.setOpacity(0.7);

        Circle cloud4 = new Circle(300, 40, 30);
        cloud4.setFill(Color.WHITE);
        cloud4.setOpacity(0.7);

        Circle cloud5 = new Circle(350, 60, 35);
        cloud5.setFill(Color.WHITE);
        cloud5.setOpacity(0.7);

        // Add everything to the pane
        pane.getChildren().addAll(house, roof, door, doorknob, window1, window2, chimney, smoke1, smoke2, smoke3, cloud1, cloud2, cloud3, cloud4, cloud5);

        // Set the scene and stage
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("House Drawing with Clouds");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
