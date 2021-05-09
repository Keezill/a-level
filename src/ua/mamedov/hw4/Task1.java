package ua.mamedov.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        int[] filledArray = fill(array);
        System.out.println("Arithmetic mean is: " + arithmeticMean(filledArray));
        System.out.println("Geometric mean is: " + geometricMean(filledArray));
    }

    private static double geometricMean(int[] array) {
        double product = 1.0;
        double average;
        for (int element : array) {
            product *= element;
        }
        average = Math.pow(product, 1.0 / (double) array.length);
        return average;
    }

    private static double arithmeticMean(int[] array) {
        double sum = 0;
        double average;
        for (int element : array) {
            sum += element;
        }
        average = sum / array.length;
        return average;
    }

    private static int[] fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10) + 1;
        }
        return array;
    }
}
