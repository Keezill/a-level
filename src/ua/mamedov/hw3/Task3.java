package ua.mamedov.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println("Text contains " + countWords(text) + " words");
    }

    private static int countWords(String text) {
        int count = 1;
        if (text.length() != 0) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ' && text.charAt(i - 1) != ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
