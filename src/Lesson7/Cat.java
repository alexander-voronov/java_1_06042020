package Lesson7;

public class Cat {
    String name;
    int APPETITE;
    boolean satiety;


    public Cat(String name, int APPETITE, boolean satiety) {
        this.name = name;
        this.APPETITE = APPETITE;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(APPETITE);
    }
}
