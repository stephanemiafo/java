/*
----------------------------------------------------------------------------------------------------------
    Name:		RandomTextRotationColorApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-19
    Purpose:	The purpose of this program is to write a JavaFX application that displays my name rotated 
    at a random angle (0 to 360) and display in random colors.
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class RandomTextRotationColorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Generate a random angle between 0 and 360
        Random random = new Random();
        double angle = random.nextDouble() * 360;

        // Generate a random color by creating random RGB values
        Color randomColor = new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), 1.0);

        // Create the Text object with your name
        Text text = new Text(100, 200, "PATRICK KEUAGHO");
        text.setFont(Font.font(40));
        text.setFill(randomColor);  // Set random color

        // Rotate the text by the random angle
        text.setRotate(angle);

        // Set up the pane to hold the text
        Pane pane = new Pane();
        pane.getChildren().add(text);

        // Set the scene and stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Randomly Rotated and Colored Name");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.layout.Pane;
// import javafx.scene.paint.Color;
// import javafx.scene.text.Font;
// import javafx.scene.text.Text;
// import javafx.stage.Stage;
// import java.util.Random;

// public class RandomTextRotationApp extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         // Generate a random angle between 0 and 360
//         Random random = new Random();
//         double angle = random.nextDouble() * 360;

//         // Create the Text object with your name
//         Text text = new Text(100, 200, "PATRICK KEUAGHO");
//         text.setFont(Font.font(40));
//         text.setFill(Color.BLACK);

//         // Rotate the text by the random angle
//         text.setRotate(angle);

//         // Set up the pane to hold the text
//         Pane pane = new Pane();
//         pane.getChildren().add(text);

//         // Set the scene and stage
//         Scene scene = new Scene(pane, 400, 400);
//         primaryStage.setTitle("Randomly Rotated Name");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
