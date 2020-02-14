package com.vertex.figuresPatternsTask;

public class ArtisanProxy implements ArtisanInterface{
    private static ArtisanInterface artisan;

    @Override
    public void draw(){
        if (artisan == null) {
            artisan = new Artisan();
        }
        artisan.draw();
    }


}
