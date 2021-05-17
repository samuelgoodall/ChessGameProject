package org.openjfx;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class MainApp extends Application {



    public static void main(String[] args) {
        //launches application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        primaryStage.setTitle("Hello");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();

    }
}
