package com.langtons;

public class Ant {
    int x;
    int y;
    Orientation orientation;

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

    void move() {
        switch(orientation) {
            case UP: y = y-1;
            case DOWN: y = y+1;
            case LEFT: y = x-1;
            case RIGHT: y = x+1;
        }
    }

    void turn_clockwise() {
        switch(orientation) {
            case UP: this.orientation = Orientation.RIGHT;
            case RIGHT: this.orientation = Orientation.DOWN;
            case DOWN: this.orientation = Orientation.LEFT;
            case LEFT: this.orientation = Orientation.UP;
        }
    }

    void turn_anitclockwise() {
        switch(orientation) {
            case UP: this.orientation = Orientation.LEFT;
            case LEFT: this.orientation = Orientation.DOWN;
            case DOWN: this.orientation = Orientation.RIGHT;
            case RIGHT: this.orientation = Orientation.UP;
        }
    }

}
