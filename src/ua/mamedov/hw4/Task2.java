package ua.mamedov.hw4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int[] filledArray = fill(array);
        System.out.println("Array has " + countPrime(filledArray) + " prime numbers");
    }

    private static int[] fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    private static int countPrime(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
