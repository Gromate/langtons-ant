package com.langtons;

import javafx.scene.paint.Color;

public class Constants {
    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 600;
    public static final int CELL_SIZE = 20;
    public static final int CELL_SPACING = 2;
    public static final int CELL_FULL_SIZE = CELL_SIZE + CELL_SPACING;
    public static final int SCREEN_CELLS_WIDTH = SCREEN_WIDTH / CELL_FULL_SIZE;
    public static final int SCREEN_CELLS_HEIGHT = SCREEN_HEIGHT / CELL_FULL_SIZE;

    //Colors
    public static final Color NON_FLIPPED_CELLS = Color.web("#f5deb3");
    public static final Color FLIPPED_CELLS = Color.web("#6357DE");
    public static final Color ANT_COLOR = Color.web("#D93312");

}
