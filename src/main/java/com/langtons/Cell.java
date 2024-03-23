package com.langtons;

import javafx.scene.paint.Color;

public class Cell {
    int x;
    int y;
    Color color;
    Boolean isFlipped;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean isFlipped() {
        return this.isFlipped;
    }

    public void flip() {
        this.isFlipped = !this.isFlipped;
    }
}
