package ua.mamedov.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int[] filledArray = fill(array);
        System.out.println("Array has " + countComposite(filledArray) + " composite numbers");
    }

    private static int[] fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    private static int countComposite(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return true;
        }
        return false;
    }
}
