package com.vertex.figuresPatternsTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            ArtisanInterface artisan = new ArtisanProxy();
            artisan.draw();
            System.out.println("One more draw? (true/false)");
        }while (scanner.nextBoolean());

    }
}