package Lesson7;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(20);

        Cat[] cats = {
                new Cat("Barsik", 8),
                new Cat("Kot", 13),
                new Cat("Koshka", 6)
        };



        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);



        }



        plate.info();

    }
}
