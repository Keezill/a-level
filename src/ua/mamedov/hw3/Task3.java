package ua.mamedov.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println("Text contains " + countWords(text) + " words");
    }

    private static int countWords(String text) {
        int count = 1;
        String[] array = text.split("[-#$%^&!?,.0-9\\s]+");
        System.out.println(Arrays.toString(array));

        return array.length;
    }
}
