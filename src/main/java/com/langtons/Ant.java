package com.langtons;

public class Ant {
    int x;
    int y;
    Orientation orientation;

    public Orientation getOrientation() {
        return orientation;
    }

    public Ant() {
        this.x = 0;
        this.y = 0;
        this.orientation = Orientation.UP;
    }
    
    public Ant(int x, int y) {
        this.x = x;
        this.y = y;
        this.orientation = Orientation.UP;
    }

    public Ant(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;

        while(this.x >= Constants.SCREEN_CELLS_WIDTH) {
            this.x -= Constants.SCREEN_CELLS_WIDTH;
        }

        while(this.x < 0) {
            this.x += (Constants.SCREEN_CELLS_WIDTH - 1);
        }
    }

    public void setY(int y) {
        this.y = y;

        while(this.y >= Constants.SCREEN_CELLS_HEIGHT) {
            this.y -= Constants.SCREEN_CELLS_HEIGHT;
        }

        while(this.y < 0) {
            this.y += (Constants.SCREEN_CELLS_HEIGHT - 1);
        }
    }

    public int getY() {
        return y;
    }

    public void move() {
        switch(orientation) {
            case UP: 
                this.setY(y-1);
                break;

            case DOWN: 
                this.setY(y+1);
                break;

            case LEFT: 
                this.setX(x-1);
                break;

            case RIGHT: 
                this.setX(x+1);
                break;

        }
    }

    void turn_clockwise() {
        switch(this.orientation) {
            case UP: 
                this.orientation = Orientation.RIGHT;
                break;

            case RIGHT: 
                this.orientation = Orientation.DOWN;
                break;

            case DOWN: 
                this.orientation = Orientation.LEFT;
                break;

            case LEFT:
                this.orientation = Orientation.UP;
                break;
        }
    }

    void turn_anticlockwise() {
        switch(orientation) {
            case UP: 
                this.orientation = Orientation.LEFT;
                break;

            case LEFT: 
                this.orientation = Orientation.DOWN;
                break;

            case DOWN: 
                this.orientation = Orientation.RIGHT;
                break;

            case RIGHT: 
                this.orientation = Orientation.UP;
                break;
        }
    }

}
