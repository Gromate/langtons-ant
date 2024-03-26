package com.langtons;

import javafx.scene.paint.Color;

public class Board {
    Cell[][] cellBoard;
    Ant ant = new Ant(Constants.SCREEN_CELLS_WIDTH / 2,Constants.SCREEN_CELLS_HEIGHT / 2);

    public Board() {
        cellBoard = new Cell[Constants.SCREEN_CELLS_WIDTH][Constants.SCREEN_CELLS_HEIGHT];
        this.fillBoard();
    }

    void fillBoard() {
        for (int i=0; i<Constants.SCREEN_CELLS_WIDTH; i++) {
            for (int j=0; j<Constants.SCREEN_CELLS_HEIGHT; j++) {
                cellBoard[i][j] = new Cell();
            }
        }
    }

    public Color getColorAtCords(int x, int y) {
        return cellBoard[x][y].getColor();
    }

    public int getAntX() {
        return ant.getX();
    }

    public int getAntY() {
        return ant.getY();
    }

    public void move() {
        int x = ant.getX();
        int y = ant.getY();

        if (!cellBoard[x][y].isFlipped()) {
            ant.turn_clockwise();
            cellBoard[x][y].flip();
            ant.move();
        }

        else {
            ant.turn_anticlockwise();
            cellBoard[x][y].flip();
            ant.move();
        }
    }
}
