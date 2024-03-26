package com.langtons;

import java.util.Random;

import javafx.scene.paint.Color;

public class Board {
    Cell[][] cellBoard;
    public Ant[] ants = new Ant[Constants.ANT_COUNT];

    public Board() {
        cellBoard = new Cell[Constants.SCREEN_CELLS_WIDTH][Constants.SCREEN_CELLS_HEIGHT];
        this.fillBoard();
        this.initAnts();
    }

    void initAnts() {
        Random rand = new Random();

        for (int i=0; i<Constants.ANT_COUNT; i++) {
            ants[i] = new Ant(rand.nextInt(Constants.SCREEN_CELLS_WIDTH), rand.nextInt(Constants.SCREEN_CELLS_HEIGHT));
        }
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

    public void move() {
        for (Ant ant : ants) {
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
}
