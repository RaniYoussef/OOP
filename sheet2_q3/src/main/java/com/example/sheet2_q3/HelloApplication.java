package com.example.sheet2_q3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Create a HBox
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);

        // Add text to hBox
        for (int i = 0; i < 5; i++) {
            // Crate a Text and set its properties
            Text text = new Text("Java");
            text.setFont(Font.font("Times Roman", FontWeight.BOLD,
                    FontPosture.ITALIC, 22));
            text.setRotate(90);

            // Set a random color and opacity
            text.setFill(new Color(Math.random(), Math.random(),
                    Math.random(), Math.random()));
            hBox.getChildren().add(text);
        }

        // Create a scene and place it in the stages
        Scene scene = new Scene(hBox, 300, 100);
        stage.setTitle("Exercise_14_04"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch();
    }
}