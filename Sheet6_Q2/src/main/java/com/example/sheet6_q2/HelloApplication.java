package com.example.sheet6_q2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;

import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane pane = new GridPane();

        // Add nodes to pane
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = (int)(Math.random() * 3);
                if (n == 0)
                    pane.add(new ImageView(new Image("image/x.gif")), j, i);
                else if (n == 1)
                    pane.add(new ImageView(new Image("image/o.gif")), j, i);
                else
                    continue;
            }
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 120, 130);
        stage.setTitle("Exercise_14_02"); // Set title for stage
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage











    }

    public static void main(String[] args) {
        launch();
    }
}