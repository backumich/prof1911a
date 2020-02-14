package com.vertex.figuresPatternsTask.Figures;

public class Rectangular implements Figure {

    private Square square;
    private int width;
    private int height;

    @Override
    public Point getPointDecorator() {
        return square.getPointDecorator();
    }

    @Override
    public int widthDecorator() {
        return square.widthDecorator()+width;
    }

    @Override
    public int heightDecorator() {
        return square.heightDecorator()+height;
    }

    @Override
    public void setPoint(int x, int y) {
        square.setPoint(x, y);
    }

    @Override
    public Point getPoint() {
        return this.square.getPoint();
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "square=" + square +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static class Builder{
        private Rectangular rectangular;

        public Builder getFigure(Square square) {
            this.rectangular = new Rectangular();
            rectangular.square = square;
            return this;
        }

        public Builder width(int width){
            this.rectangular.width = width;
            return this;
        }
        public Builder height(int height){
            this.rectangular.height = height;
            return this;
        }

        public Rectangular build(){
            return this.rectangular;
        }

    }
}
