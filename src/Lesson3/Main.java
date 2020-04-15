package Lesson3;

import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int x = random.nextInt(10);
        System.out.println("Введите число от 0 до 9");
        for (int i = 1; i <= 10; i++) {
            int y = sc.nextInt();
            if (x > y) {
                System.out.println("Не угадал, загаданное число больше введённого");
            }
            if (x < y) {
                System.out.println("Не угадал, загаданное число меньше введённого");
            }
            if (x == y) {
                System.out.println("Угадал!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int z = sc.nextInt();
                if (z == 0) {
                    break;
                } else return;
            }
        }

    }
}
