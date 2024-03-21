package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        var scene = new Scene(root, 640, 480);

        for (int i=0; i < 100; i++) {
            for (int j=0; j< 100; j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setX(i * 11);
                rectangle.setY(j * 11);
                rectangle.setHeight(10);
                rectangle.setWidth(10);
                rectangle.setFill(Color.BLACK);

                root.getChildren().add(rectangle);
            }
        }

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}