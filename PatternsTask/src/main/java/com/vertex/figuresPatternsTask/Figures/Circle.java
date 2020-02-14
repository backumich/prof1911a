package com.vertex.figuresPatternsTask.Figures;

public class Circle implements Figure {

    private Point point;
    private int radios;

    @Override
    public Point getPointDecorator() {
        return getPoint();
    }

    @Override
    public int widthDecorator() {
        return radios;
    }

    @Override
    public int heightDecorator() {
        return radios;
    }

    @Override
    public void setPoint(int x, int y) {
        this.point = new Point(x,y);
    }


    @Override
    public Point getPoint() {
        return this.point;
    }

    @Override
    public void setWidth(int width) {
        this.radios = width;
    }

    @Override
    public void setHeight(int height) {
        this.radios = height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point  x=" + point.getX()+", y= " + point.getY()+
                ", radios=" + radios +
                '}';
    }

    public static class Builder{
        private Circle circle;

        public Builder setPoint(int x, int y) {
            this.circle = new Circle();
            this.circle.point = new Point(x, y);
            return this;
        }
        public Builder radios(int radios) {
            this.circle.radios = radios;
            return this;
        }

        public Circle build(){
            return this.circle;
        }
    }
}