package com.langtons;

import javafx.scene.paint.Color;

public class Cell {
    Color color;
    Boolean isFlipped;

    public Cell() {
        color = Color.WHEAT;
        isFlipped = false;
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
        if (isFlipped) {
            color = Color.DARKGREY;
        }

        else if (!isFlipped) {
            color = Color.WHEAT;
        }
    }

    public Boolean isFlipped() {
        return this.isFlipped;
    }

    public void flip() {
        this.isFlipped = !this.isFlipped;
        this.setColor();
    }
}
