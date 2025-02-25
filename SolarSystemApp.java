/*
----------------------------------------------------------------------------------------------------------
    Name:		SolarSystemApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a JavaFX application that displays a depiction of 
    a solar system with a sun and three planets
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-19	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class SolarSystemApp extends Application {

    // Define planets and their orbits
    private double[] planetAngles = {0, 0, 0}; // Angles for each planet (start at 0)
    private final double[] orbitRadiiX = {100, 150, 200}; // X radii for each planet's orbit (ellipse width)
    private final double[] orbitRadiiY = {80, 120, 160}; // Y radii for each planet's orbit (ellipse height)
    private final double[] orbitSpeeds = {0.05, 0.03, 0.02}; // Speeds for each planet's orbit

    @Override
    public void start(Stage primaryStage) {
        // Create the sun (a yellow circle)
        Circle sun = new Circle(300, 300, 30);
        sun.setFill(Color.YELLOW);

        // Create the orbits (ellipses) for the planets
        Ellipse orbit1 = new Ellipse(300, 300, orbitRadiiX[0], orbitRadiiY[0]);
        orbit1.setFill(Color.TRANSPARENT);
        orbit1.setStroke(Color.LIGHTGRAY);

        Ellipse orbit2 = new Ellipse(300, 300, orbitRadiiX[1], orbitRadiiY[1]);
        orbit2.setFill(Color.TRANSPARENT);
        orbit2.setStroke(Color.LIGHTGRAY);

        Ellipse orbit3 = new Ellipse(300, 300, orbitRadiiX[2], orbitRadiiY[2]);
        orbit3.setFill(Color.TRANSPARENT);
        orbit3.setStroke(Color.LIGHTGRAY);

        // Create planets (circles)
        Circle planet1 = new Circle(300 + orbitRadiiX[0], 300, 10);
        planet1.setFill(Color.BLUE);

        Circle planet2 = new Circle(300 + orbitRadiiX[1], 300, 12);
        planet2.setFill(Color.RED);

        Circle planet3 = new Circle(300 + orbitRadiiX[2], 300, 15);
        planet3.setFill(Color.GREEN);

        // Group all the elements together
        Group root = new Group();
        root.getChildren().addAll(sun, orbit1, orbit2, orbit3, planet1, planet2, planet3);

        // Set up the scene
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Solar System");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Animation to move the planets along elliptical orbits
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                // Update planet positions based on their respective angles and speeds
                planetAngles[0] += orbitSpeeds[0];
                planetAngles[1] += orbitSpeeds[1];
                planetAngles[2] += orbitSpeeds[2];

                // Calculate the new positions for each planet based on its elliptical orbit
                planet1.setCenterX(300 + orbitRadiiX[0] * Math.cos(planetAngles[0]));
                planet1.setCenterY(300 + orbitRadiiY[0] * Math.sin(planetAngles[0]));

                planet2.setCenterX(300 + orbitRadiiX[1] * Math.cos(planetAngles[1]));
                planet2.setCenterY(300 + orbitRadiiY[1] * Math.sin(planetAngles[1]));

                planet3.setCenterX(300 + orbitRadiiX[2] * Math.cos(planetAngles[2]));
                planet3.setCenterY(300 + orbitRadiiY[2] * Math.sin(planetAngles[2]));
            }
        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
