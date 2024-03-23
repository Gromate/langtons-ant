package com.langtons;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DisplayBoard extends Group {
    static final int SCREEN_WIDTH = 1280;
    static final int SCREEN_HEIGHT = 600;

    int size = 20;
    int spacing = 2;

    public DisplayBoard() {
        for (int i=0; i < SCREEN_WIDTH / (size + spacing); i++) {
            for (int j=0; j< SCREEN_HEIGHT / (size + spacing); j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setX(i * (size+spacing));
                rectangle.setY(j * (size+spacing));
                rectangle.setHeight(size);
                rectangle.setWidth(size);
                rectangle.setFill(Color.DARKSLATEGRAY);

                this.getChildren().add(rectangle);
            }
        }
    }

}
