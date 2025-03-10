/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_PizzaOrderApp
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-28
    Purpose:	The purpose of this program is to write an application that allows the user to pick 
    a set of pizza toppings using a set of check boxes. The application will also display the cost 
    of the pizza updated with the price of the topping.

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
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PSK_CPT_189_01_PizzaOrderApp extends Application {
    // Base price of a plain pizza
    private static final double BASE_PRICE = 10.50;
    // Cost per topping
    private static final double TOPPING_PRICE = 1.50;
    // Text element to display the total price
    private Text priceDisplay;

    @Override
    public void start(Stage primaryStage) {
        // Create a text label for the price display
        priceDisplay = new Text("Total Price: $" + String.format("%.2f", BASE_PRICE));

        // Create checkboxes for pizza toppings
        CheckBox chkPepperoni = new CheckBox("Pepperoni");
        CheckBox chkMushrooms = new CheckBox("Mushrooms");
        CheckBox chkOnions = new CheckBox("Onions");
        CheckBox chkSausage = new CheckBox("Sausage");
        CheckBox chkBacon = new CheckBox("Bacon");
        CheckBox chkOlives = new CheckBox("Olives");
        CheckBox chkPeppers = new CheckBox("Peppers");

        // Add event handlers to update price when toppings are selected or deselected
        chkPepperoni.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));
        chkMushrooms.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));
        chkOnions.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));
        chkSausage.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));
        chkBacon.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));
        chkOlives.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));
        chkPeppers.setOnAction(e -> updatePrice(chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers));

        // Arrange all elements in a vertical box layout
        VBox root = new VBox(10, priceDisplay, chkPepperoni, chkMushrooms, chkOnions, chkSausage, chkBacon, chkOlives, chkPeppers);
        root.setAlignment(Pos.CENTER_LEFT);
        root.setStyle("-fx-padding: 20; -fx-background-color: beige;");

        // Create the scene and set up the stage
        Scene scene = new Scene(root, 300, 350);
        primaryStage.setTitle("Pizza Order System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to update the price when toppings are selected/deselected
    private void updatePrice(CheckBox... toppings) {
        int selectedCount = 0;
        
        // Count how many toppings are selected
        for (CheckBox topping : toppings) {
            if (topping.isSelected()) {
                selectedCount++;
            }
        }
        
        // Calculate the new total price
        double totalPrice = BASE_PRICE + (selectedCount * TOPPING_PRICE);
        // Update the price display
        priceDisplay.setText("Total Price: $" + String.format("%.2f", totalPrice));
    }

    public static void main(String[] args) {
        launch(args);  
    }
}
