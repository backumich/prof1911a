package com.vertex.figuresPatternsTask.Figures;

public interface Figure {
    Point getPointDecorator();

    int widthDecorator();

    int heightDecorator();

    void setPoint(int x, int y);

    Point getPoint();

    public String toString();

    void setWidth(int width);

    void setHeight(int height);

}
