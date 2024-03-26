package com.langtons;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DisplayBoard extends Group {
    static final int SCREEN_WIDTH = 1280;
    static final int SCREEN_HEIGHT = 600;

    Board cellBoard = new Board();

    int size = 20;
    int spacing = 2;

    public DisplayBoard() {
        this.drawBoard();
    }

    public void drawBoard() {
        for (int i=0; i < SCREEN_WIDTH / (size + spacing); i++) {
            for (int j=0; j< SCREEN_HEIGHT / (size + spacing); j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setX(i * (size+spacing));
                rectangle.setY(j * (size+spacing));
                rectangle.setHeight(size);
                rectangle.setWidth(size);
                rectangle.setFill(cellBoard.getColorAtCords(i, j));

                this.getChildren().add(rectangle);
            }
        }
    }

    void flipSquare(int x, int y) {
        int cellNumber = x*SCREEN_HEIGHT/22 + y;
        ((Rectangle)this.getChildren().get(cellNumber)).setFill(cellBoard.getColorAtCords(x, y));
    }

    void flipSquare(int x, int y, Color color) {
        int cellNumber = x*SCREEN_HEIGHT/22 + y;
        ((Rectangle)this.getChildren().get(cellNumber)).setFill(color);
    }

    public void move() {
        flipSquare(cellBoard.getAntX(), cellBoard.getAntY());
        cellBoard.move();
        colorAnt();
    }

    public void colorAnt() {
        int x = cellBoard.getAntX();
        int y = cellBoard.getAntY();

        flipSquare(x, y, Color.RED);
    }

}
