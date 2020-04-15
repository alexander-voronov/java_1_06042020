package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i]--;
            } else a[i]++;
        }

        int g = 3;
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = g;
            g += 3;

        }

        //System.out.println(Arrays.toString(arr));

        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) {
                b[i] *= 2;
            }
        }

        // System.out.println(Arrays.toString(b));


        int counter = 1;

        int[][] table = new int[4][4];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    table[i][j] = counter;
                }
                if (j == table.length - 1 - i) {
                    table[i][j] = counter;
                }
               // System.out.print(table[i][j] + " ");
            }
          //  System.out.println();

        }
    }

}


