package com.anhnv02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // if initialCats < 0 -> World goes BOOM!!!!!!
        //if initialCats = catsAsHeroes -> Yay! The world is saved!
        //Find the less steps possible to make initialCats = catsAsHeroes

	    int initialCats;
	    int catsAsHeroes;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial Cat(s): ");
        initialCats = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cats to be heroes: ");
        catsAsHeroes = scanner.nextInt();
        scanner.nextLine();

        int total = CatHeroesTrainingProgram.training(initialCats, catsAsHeroes);
        System.out.println("Number of steps: " + String.valueOf(total));
    }
}
