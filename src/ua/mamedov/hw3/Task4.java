package ua.mamedov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Guess the number from 0 to 9:");
        guessNumber(number);
    }

    private static void guessNumber(int number) {
        var scanner = new Scanner(System.in);
        boolean win = isWinner(number, scanner);
        while (!win) {
            win = isWinner(number, scanner);
        }
    }

    public static boolean isWinner(int number, Scanner scanner){
        var expectedNum = scanner.nextInt();
        if (expectedNum >= 10) {
            System.out.println("Number is too high");
            return false;
        } else if (expectedNum == number) {
            System.out.println("Congratulations, you guessed the number");
            return true;
        } else if (expectedNum < number) {
            System.out.println("number > " + expectedNum + ". Try again");
            return false;
        } else if (expectedNum > number) {
            System.out.println("number < " + expectedNum + ". Try again");
            return false;
        }
        return false;
    }
}