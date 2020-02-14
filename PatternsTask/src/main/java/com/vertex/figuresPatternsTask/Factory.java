package com.vertex.figuresPatternsTask;

import com.vertex.figuresPatternsTask.Figures.*;

import java.util.Scanner;

public class Factory {

    public static final Factory INSTANCE = new Factory();
    private Factory() {
    }

    public Figure get(String s){
        Scanner scanner = new Scanner(System.in);
        if (s.equals("Circle")){
            System.out.println("Input x, y, radios: ");
            return new Circle.Builder().setPoint(scanner.nextInt(),scanner.nextInt()).radios(scanner.nextInt()).build();
        }
        else if(s.equals("Oval")) {
            System.out.println("Input x, y, width, height: ");
            return new Oval.Builder()
                    .getFigure(new Circle.Builder().setPoint(scanner.nextInt(),scanner.nextInt()).build())
                    .width(scanner.nextInt())
                    .height(scanner.nextInt())
                    .build();
        }
        else if(s.equals("Square")){
            System.out.println("Input x, y, width: ");
            return new Square.Builder().setPoint(scanner.nextInt(),scanner.nextInt()).width(scanner.nextInt()).build();
        }
        else if (s.equals("Rect")){
            System.out.println("Input x, y, width, height: ");
            return new Rectangular.Builder()
                    .getFigure(new Square.Builder().setPoint(scanner.nextInt(),scanner.nextInt()).build())
                    .width(scanner.nextInt())
                    .height(scanner.nextInt())
                    .build();
        }
        else return null;
    }
}
