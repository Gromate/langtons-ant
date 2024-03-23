package com.langtons;

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
    DisplayBoard root;
    int x;

    @Override
    public void start(Stage stage) {
        root = new DisplayBoard();
        var scene = new Scene(root);
        x = 0;

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

        Random rand = new Random();

        @Override
        public void handle(long arg0) {
            for (Node children : root.getChildren()) {
            }
        }

    }

}
