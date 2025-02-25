/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_CounterApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-22
    Purpose:	The purpose of this program is to create a JavaFX application that presents two buttons to
    the user so that when the increment button is pushed the initial value (50) increment or decrement 
    when the decrement button is pushed.
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
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PSK_CPT_189_01_CounterApp extends Application {
    private int intCount = 50; // Initialize count to 50
    private Label lblCountLabel; // Label to display the number

    @Override
    public void start(Stage primaryStage) {
        // Label to display the current count
        lblCountLabel = new Label("Count: " + intCount);

        // Create Increment button
        Button btonIncrementButton = new Button("Increment");
        btonIncrementButton.setOnAction(e -> incrementCount());

        // Create Decrement button
        Button btonDecrementButton = new Button("Decrement");
        btonDecrementButton.setOnAction(e -> decrementCount());

        // Layout setup
        VBox vbxRoot = new VBox(10, lblCountLabel, btonIncrementButton, btonDecrementButton);
        vbxRoot.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        // Scene and Stage setup
        Scene scnScene = new Scene(vbxRoot, 300, 200);
        primaryStage.setTitle("Counter App");
        primaryStage.setScene(scnScene);
        primaryStage.show();
    }

    // Method to increment the count
    private void incrementCount() {
        intCount++;
        lblCountLabel.setText("Count: " + intCount);
    }

    // Method to decrement the count
    private void decrementCount() {
        intCount--;
        lblCountLabel.setText("Count: " + intCount);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
