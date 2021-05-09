package ua.mamedov.hw4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        int[] filledArray = fill(array);
        System.out.println("All " + changeEvenToZero(filledArray) + " even number is changed to 0");
    }

    private static int changeEvenToZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                array[i] = 0;
                count++;
            }
        }
        return count;
    }

    private static int[] fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        return array;
    }
}
