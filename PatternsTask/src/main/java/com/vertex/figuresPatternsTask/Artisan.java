package com.vertex.figuresPatternsTask;

import com.vertex.figuresPatternsTask.Figures.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class Artisan implements ArtisanInterface {
    private ArrayList<Figure> figures;
    public Artisan(int size) {

        this.figures = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle / Oval / Square / Rect");
        for (int i = 0; i<size; i++){
            figures.add(Factory.INSTANCE.get(scanner.next()));
        }
    }

    public Artisan(){
        this(10);
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }



    @Override
    public void draw(){
        System.out.println("Input count output figure?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j=0; i>j; j++) {
            if (figures.isEmpty()){
                figures.addAll(new Artisan().getFigures());
            }
            try{
                Figure figure = figures.get(0);
                System.out.println(figure.toString());
                figures.remove(0);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
