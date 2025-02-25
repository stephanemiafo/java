package PSK_Examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageDisplayApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Load images (Replace with actual image file paths or URLs)
        Image image1 = new Image("file:image1.jpg");
        Image image2 = new Image("file:image2.jpg");
        Image image3 = new Image("file:image3.jpg");

        // Create ImageView objects
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);

        // Set preferred width/height if needed
        imageView1.setFitWidth(200);
        imageView1.setPreserveRatio(true);
        imageView2.setFitWidth(200);
        imageView2.setPreserveRatio(true);
        imageView3.setFitWidth(200);
        imageView3.setPreserveRatio(true);

        // Create FlowPane with spacing
        FlowPane flowPane = new FlowPane(20, 20, imageView1, imageView2, imageView3);

        // Create Scene and set up Stage
        Scene scene = new Scene(flowPane, 700, 300);
        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
