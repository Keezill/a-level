package Homework;

public class Homework2 {
    public static void main(String[] args) {
        getSquareOfTriangle();
        checkIfNumberEven(51);
        getSmallestModulusOfNumber(-1.2, -2.6, 8.1);
    }

    private static void getSquareOfTriangle() {
        int x = 3;
        int y = 5;
        int z = 4;

        int result = x * y * z;
        System.out.println("Square of triangle: " + result);

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
        System.out.println(a < 0 ? "Modulus of first number = " + Math.abs(a) : "Modulus of first number = " + a);
        System.out.println(b < 0 ? "Modulus of second number = " + Math.abs(b) : "Modulus of first number = " + b);
        System.out.println(c < 0 ? "Modulus of third number = " + Math.abs(c) : "Modulus of first number = " + c);
        if (Math.abs(a) < Math.abs(b) && Math.abs(a) < Math.abs(c)) {
            System.out.println("The smallest modulus: " + Math.abs(a));
        } else if (Math.abs(b) < Math.abs(a) && Math.abs(b) < Math.abs(c)) {
            System.out.println("The smallest modulus: " + Math.abs(b));
        } else if (Math.abs(c) < Math.abs(a) && Math.abs(c) < Math.abs(b)) {
            System.out.println("The smallest modulus: " + Math.abs(c));
        }
    }
}