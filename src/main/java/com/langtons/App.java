package com.langtons;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
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
        @Override
        public void handle(long arg0) {
            root.move();
        }

    }

}
