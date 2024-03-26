package com.langtons;

import javafx.scene.paint.Color;

public class Board {
    Cell[][] cellBoard;
    Ant ant = new Ant(1280/22/2,600/22/4);

    public Board() {
        cellBoard = new Cell[1280/22][600/22];
        this.fillBoard();
    }

    void fillBoard() {
        for (int i=0; i<1280/22; i++) {
            for (int j=0; j<600/22; j++) {
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
        System.out.println(y);
        System.out.println(x);

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
