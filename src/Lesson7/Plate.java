package Lesson7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food : " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void increaseFood(int amount) {
        food += amount;
    }
}
