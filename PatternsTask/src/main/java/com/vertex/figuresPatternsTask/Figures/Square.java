package com.vertex.figuresPatternsTask.Figures;

public class Square implements Figure {

    private Point point;
    private int width;

    @Override
    public Point getPointDecorator() {
        return new Point(10, 10);
    }

    @Override
    public int widthDecorator() {
        return width;
    }

    @Override
    public int heightDecorator() {
        return width;
    }

    @Override
    public void setPoint(int x, int y) {

    }

    @Override
    public Point getPoint() {
        return this.point;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "point=" + point.getX()+" "+point.getY() +
                ", width=" + width +
                '}';
    }

    public static class Builder{
        private Square square;

        public Builder setPoint(int x, int y) {
            this.square = new Square();
            this.square.point = new Point(x, y);
            return this;
        }
        public Builder width(int width) {
            this.square.width = width;
            return this;
        }

        public Square build(){
            return this.square;
        }
    }

}
