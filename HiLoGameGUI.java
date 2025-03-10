/*
----------------------------------------------------------------------------------------------------------
    Name:		HiLoGameGUI
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-03-01
    Purpose:	The purpose of this program is to write a HiLo guessing game App where a random number 
    is picked by the program and the user is prompted to guess it. On each guess, the program will hint 
    the user if the user's picked number is higher or lower than the random number. Once the user picked 
    the right number, the program will report back to the user with the correct number and the number 
    of guesses it took the user to get the right number.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-03-01	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;



public class HiLoGameGUI extends Application {
   private int numberToGuess;
    private int guessCount;
    private Random random = new Random();

    private Label lblMessage = new Label("Guess a number between 1 and 100.");
    private TextField txtGuess = new TextField();
    private Button btnGuess = new Button("Submit Guess");
    private Button btnNewGame = new Button("New Game");
    private Button btnExit = new Button("Exit Game"); // New Exit Button

    @Override
    public void start(Stage primaryStage) {
        resetGame();  // Start a new game

        txtGuess.setMaxWidth(80); // Limit text field size
        txtGuess.setAlignment(Pos.CENTER);

        btnGuess.setOnAction(e -> processGuess());
        btnNewGame.setOnAction(e -> resetGame());
        btnExit.setOnAction(e -> primaryStage.close()); // Close window when clicked

        VBox root = new VBox(15, lblMessage, txtGuess, btnGuess, btnNewGame, btnExit);
        root.setAlignment(Pos.CENTER);
        root.setMinWidth(300);

        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.setTitle("Hi-Lo Guessing Game");
        primaryStage.show();
    }

    private void processGuess() {
        try {
            int userGuess = Integer.parseInt(txtGuess.getText());
            guessCount++;

            if (userGuess < 1 || userGuess > 100) {
                lblMessage.setText("Please enter a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                lblMessage.setText("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                lblMessage.setText("Too high! Try again.");
            } else {
                lblMessage.setText("Correct! It took you " + guessCount + " guesses.");
                btnGuess.setDisable(true);
            }

            txtGuess.clear();
        } catch (NumberFormatException e) {
            lblMessage.setText("Please enter a valid number.");
        }
    }

    private void resetGame() {
        numberToGuess = random.nextInt(100) + 1;
        guessCount = 0;
        lblMessage.setText("Guess a number between 1 and 100.");
        btnGuess.setDisable(false);
        txtGuess.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
