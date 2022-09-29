package by.itacademy.exercise1;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {

        final int[] array = getArray(new int[10]);
        System.out.println(Arrays.toString(array));

        getPositiveAndOddNumber(array);
    }
    static void getPositiveAndOddNumber(final int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j % 2 != 0 && j > 0) {
                counter++;
                System.out.println("value: " + j);
            }
        }
        System.out.println("number of positive odd values: " + counter);
    }

    static int[] getArray(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
        return array;
    }
}
