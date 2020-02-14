package com.vertex.figuresPatternsTask.Figures;

public class Oval implements Figure {

    private Circle circle;
    private int width;
    private int height;

    @Override
    public Point getPointDecorator() {
        return circle.getPointDecorator();
    }

    @Override
    public int widthDecorator() {
        return circle.widthDecorator()+width;
    }

    @Override
    public int heightDecorator() {
        return circle.heightDecorator()+height;
    }

    @Override
    public void setPoint(int x, int y) {
        circle.setPoint(x, y);
    }

    @Override
    public Point getPoint() {
        return circle.getPoint();
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
        return "Oval{" +
                "circle=" + circle +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static class Builder{
        private Oval oval;

        public Builder getFigure(Circle circle){
            this.oval = new Oval();
            oval.circle = circle;
            return this;
        }

        public Builder width(int width){
            this.oval.width = width;
            return this;
        }

        public Builder height(int height){
            this.oval.height = height;
            return this;
        }

        public Oval build(){
            return this.oval;
        }
    }
}
