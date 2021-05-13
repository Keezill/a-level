package ua.mamedov.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int numToDelete = 5;
        fillArrayRandom(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] newArray = removeElement(numbers, numToDelete);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] removeElement(int[] numbers, int k) {
        int[] newArray = new int[numbers.length];
        int count = 0;
        for (int number : numbers) {
            if (number != k) {
                newArray[count++] = number;
            }
        }
        return trim(newArray, count);
    }

    private static int[] trim(int[] newArray, int count) {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    private static void fillArrayRandom(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
    }
}
