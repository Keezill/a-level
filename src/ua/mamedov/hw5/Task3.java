package ua.mamedov.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        fillArray(numbers);
        for (int[] innerArray : numbers) {
            System.out.println(Arrays.toString(innerArray));
        }
        System.out.println();
        int[][] newArray = swapColumnsAndRows(numbers);
        for (int[] innerArray : newArray) {
            System.out.println(Arrays.toString(innerArray));
        }
    }

    private static int[][] swapColumnsAndRows(int[][] numbers) {
        int [][] newArray = new int[numbers.length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                newArray[j][i] = numbers[i][j];
            }
        }
        return newArray;
    }

    private static void fillArray(int[][] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(100);
            }
        }
    }
}
