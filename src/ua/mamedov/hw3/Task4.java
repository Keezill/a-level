package ua.mamedov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Guess the number from 0 to 9:");
        var number = new Random().nextInt(10);
        while (true) {
            var num = new Scanner(System.in).nextInt();

            if (num >= 10) {
                System.out.println("Number is too high");
            } else if (num == number) {
                System.out.println("Congratulations, you guessed the number");
                break;
            } else if (num < number) {
                System.out.println("number < " + num + ". Try again");
            } else if (num > number) {
                System.out.println("number > " + num + ". Try again");
            }
            //System.out.println(num == number ? "Congratulations, you guessed the number" : "Sorry, but your number is invalid!");
        }
    }
}