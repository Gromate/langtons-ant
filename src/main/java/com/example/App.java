package com.example;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    static final int SCREEN_WIDTH = 1280;
    static final int SCREEN_HEIGHT = 600;
    Group root;
    int x;

    @Override
    public void start(Stage stage) {
        root = new Group();
        var scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);
        x = 0;

        int size = 2;
        int spacing = 0;

        for (int i=0; i < SCREEN_WIDTH / (size + spacing); i++) {
            for (int j=0; j< SCREEN_HEIGHT / (size + spacing); j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setX(i * (size+spacing));
                rectangle.setY(j * (size+spacing));
                rectangle.setHeight(size);
                rectangle.setWidth(size);
                rectangle.setFill(Color.DARKSLATEGRAY);

                root.getChildren().add(rectangle);
            }
        }
        AnimationTimer tm = new TimerMethod();
        tm.start();

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private class TimerMethod extends AnimationTimer {
        int klatka; 

        Random rand = new Random();

        @Override
        public void handle(long arg0) {
            for (Node children : root.getChildren()) {
                ((Rectangle)children).setFill(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
            }
        }

    }

}
