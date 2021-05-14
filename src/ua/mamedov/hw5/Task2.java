package ua.mamedov.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Array is descending: " + isDescending(numbers));
    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
    }

    private static boolean isDescending(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
