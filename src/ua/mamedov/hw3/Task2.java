package ua.mamedov.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        String text2 = deleteSpace(text);
        System.out.println(isPalindrome(text2) ? text2 + " is palindrome" : text2 + " is not palindrome");
    }

    private static String deleteSpace(String text) {
        return text.replaceAll("\\s", "");
    }

    private static boolean isPalindrome(String text) {
        if (text.equalsIgnoreCase(new StringBuilder(text).reverse().toString())) {
            return true;
        }
        return false;
    }
}
