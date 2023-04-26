package com.example.sheet6_javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {


        GridPane pane = new GridPane();
        Image img1 = new Image("china.gif");
        Image img2 = new Image("ca.gif");
        Image img3 = new Image("uk.gif");
        Image img4 = new Image("us.gif");


        pane.getChildren().add(new ImageView(img1));
        pane.getChildren().add(new ImageView(img2));
        pane.getChildren().add(new ImageView(img3));
        pane.getChildren().add(new ImageView(img4));
        
        Scene scene = new Scene(pane ,600, 300);

        stage.setTitle("showing four images ");
        stage.setScene(scene);
        stage.show();










    }

    public static void main(String[] args) {
        launch(args);
    }
}