package ua.mamedov.hw2;

public class Task123 {
    public static void main(String[] args) {
        getSquareOfTriangle(1,1,2,5,5,3);
        checkIfNumberEven(51);
        getSmallestModulusOfNumber(-1.2, -2.6, 8.1);
    }

    private static void getSquareOfTriangle(int x1, int y1, int x2, int y2 , int x3, int y3) {

        int square = Math.abs((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)) / 2;
        System.out.println("Square of triangle: " + square);

        System.out.println();
    }

    private static void checkIfNumberEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is not even.");
        }
        System.out.println();
    }

    private static void getSmallestModulusOfNumber(double a, double b, double c) {
        var num1 = a < 0 ? -a : a;
        var num2 = b < 0 ? -b : b;
        var num3 = c < 0 ? -c : c;
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest modulus is " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest modulus is " + num2);
        } else if (num3 < num2 && num3 < num2) {
            System.out.println("The smallest modulus is " + num3);
        }
    }
}