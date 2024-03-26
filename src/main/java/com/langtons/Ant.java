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

    public int getY() {
        return y;
    }

    public void move() {
        switch(orientation) {
            case UP: 
                this.y -= 1;
                break;

            case DOWN: 
                this.y += 1;
                break;

            case LEFT: 
                this.x = x-1;
                break;

            case RIGHT: 
                this.x = x+1;
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
