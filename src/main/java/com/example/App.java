package com.example;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    Group root;
    int x;

    @Override
    public void start(Stage stage) {
        root = new Group();
        var scene = new Scene(root, 1280, 530);
        x = 0;

        int size = 10;
        int spacing = -1;

        for (int i=0; i < 100; i++) {
            for (int j=0; j< 100; j++) {
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

        @Override
        public void handle(long arg0) {
            for (Node children : root.getChildren()) {
                klatka++;
                    x ++;
                    ((Rectangle)children).setRotate(x/10000);
                    klatka = 0;
            }
        }

    }

}
