package ua.mamedov.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        deleteSpace(text);
        System.out.println(isPalindrome(text) ? text + " is palindrome" : text + " is not palindrome");
    }

    private static void deleteSpace(String text) {
        String newText = text.replaceAll("\\s", "");
        isPalindrome(newText);
    }

    private static boolean isPalindrome(String text) {
        if (text.equalsIgnoreCase(new StringBuilder(text).reverse().toString())) {
            return true;
        }
        return false;
    }
}
