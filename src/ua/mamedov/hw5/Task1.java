package ua.mamedov.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] numbers = new int[6][5];
        fillArray(numbers);
        for (int[] innerArray : numbers) {
            System.out.println(Arrays.toString(innerArray));
        }
    }

    private static void fillArray(int[][] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(i % 2 == 0) {
                    numbers[i][j] = index;
                } else {
                    numbers[i][j] = -index;
                }
                index++;
            }
        }
    }
}
