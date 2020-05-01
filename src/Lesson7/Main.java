package Lesson7;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int addFood;

        Plate plate = new Plate(20);

        Cat[] cats = {
                new Cat("Barsik", 8, false),
                new Cat("Kot", 13, false),
                new Cat("Koshka", 6, false)
        };


        for (int i = 0; i < cats.length; i++) {

            if (cats[i].APPETITE < plate.food) {
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println("Cat " + cats[i].name + " eat...");
            } else {
                System.out.println("Cat " + cats[i].name + " don't eat ");
            }

        }

        plate.info();
        System.out.println(" Add food ");
        addFood = sc.nextInt();
        plate.increaseFood(addFood);
        plate.info();

    }
}
