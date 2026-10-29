package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Riyan
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            // Loads bmi.fxml from src/main/resources/fxml/bmi.fxml
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/bmi.fxml"));
            
            // Creates the scene using the layout defined in FXML
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("BMI Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Could not load FXML file. Check the path and controller configuration.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
