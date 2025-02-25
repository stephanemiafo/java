package PSK_Examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class PSK_CPT_189_01_RandomNumberApp {
    private Random random = new Random(); // Random number generator
    private Label numberLabel; // Label to display the number

    @Override
    public void start(Stage primaryStage) {
        // Initialize label with default text
        numberLabel = new Label("Click the button to generate a number!");

        // Create button
        Button generateButton = new Button("Generate Random Number");
        generateButton.setOnAction(e -> generateRandomNumber());

        // Layout
        VBox root = new VBox(10, numberLabel, generateButton);
        root.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        // Scene and Stage setup
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Random Number Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to generate and update the random number
    private void generateRandomNumber() {
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        numberLabel.setText("Random Number: " + randomNumber);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
