package com.vertex.figuresPatternsTask.Figures;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point setX(int x) {
        return new Point(x,this.y);
    }

    public Point setY(int y) {
        return new Point(this.x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
