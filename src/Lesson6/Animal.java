package Lesson6;

public class Animal {

    protected String name;


    public Animal(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + "run");
    }

    public void jump() {
        System.out.println(name + "jump");
    }

    public void swim() {
        System.out.println(name + "swim");
    }

}
