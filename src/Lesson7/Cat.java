package Lesson7;

public class Cat {
    String name;
    int APPETITE;
    int satiety;


    public Cat(String name, int APPETITE) {
        this.name = name;
        this.APPETITE = APPETITE;
    }



    public void eat(Plate plate) {

        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(APPETITE);
    }


}
