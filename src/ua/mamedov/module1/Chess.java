package ua.mamedov.module1;

import java.util.Arrays;
import java.util.Scanner;

public class Chess {
    public static final String EMPTY = " ";

    public static final String[] USER = {"X"};

    public static final String[][] BOARD = {
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},

    };
    public static final int[][] NUMBERS = {
            {57, 58, 59, 60, 61, 62, 63, 64},
            {49, 50, 51, 52, 53, 54, 55, 56},
            {41, 42, 43, 44, 45, 46, 47, 48},
            {33, 34, 35, 36, 37, 38, 39, 40},
            {25, 26, 27, 28, 29, 30, 31, 32},
            {17, 18, 19, 20, 21, 22, 23, 24},
            {9, 10, 11, 12, 13, 14, 15, 16},
            {1, 2, 3, 4, 5, 6, 7, 8},
    };

    static void printGameRules() {
        System.out.println("You can enter the current position of the knight");
        System.out.println("Then you can enter the cell to which you want to try to move the knight");
        for (int[] innerArray : Chess.NUMBERS) {
            System.out.println(Arrays.toString(innerArray));
        }
    }

    static int readUserInputKnight() {
        while (true) {
            System.out.println("Please enter coordinates of the cell where you want to place knight");
            var userInputKnight = new Scanner(System.in).nextInt();
            if (userInputKnight >= 1 && userInputKnight <= 64) {
                for (int rows = 0; rows < NUMBERS.length; rows++) {
                    for (int cols = 0; cols < NUMBERS.length; cols++) {
                        if (userInputKnight == NUMBERS[rows][cols]) {
                            return userInputKnight;
                        }
                    }
                }
                System.out.print("Knight can't be placed at this cell:" + userInputKnight);
            }
        }
    }

    static int readUserInputMove(int knightCell) {
        while (true) {
            System.out.println("Please enter coordinates where you want knight to move");
            var userInputMove = new Scanner(System.in).nextInt();
            if (userInputMove >= 1 && userInputMove <= 64) {
                if ((userInputMove == knightCell + 6 || userInputMove == knightCell + 10 ||
                        userInputMove == knightCell + 15 || userInputMove == knightCell + 17 ||
                        userInputMove == knightCell - 6 || userInputMove == knightCell - 10 ||
                        userInputMove == knightCell - 15 || userInputMove == knightCell - 17)
                        && checkForRowsAndCols(knightCell, userInputMove)) {
                    System.out.println("Move is possible");
                    return userInputMove;
                } else {
                    System.out.println("Knight can't be placed at this cell: " + userInputMove + " Try again");
                }
            }
        }
    }


    static void makeUserProgress(int number) {
        for (int rows = 0; rows < NUMBERS.length; rows++) {
            for (int cols = 0; cols < NUMBERS.length; cols++) {
                if (number == NUMBERS[rows][cols]) {
                    BOARD[rows][cols] = USER[0];
                }
            }
        }
        buildGameBoard();
    }


    static void buildGameBoard() {
        System.out.println("---------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print("| ");
            for (int j = 0; j < 8; j++) {
                System.out.print(BOARD[i][j] + " | ");
            }
            System.out.println();
            System.out.println("---------------------------------");
        }
        System.out.println("'X' is your knight");
    }

    //Этот метод добавил потому что не все доступные ходы оказыввались поблизости
    //если выбрать крайнюю ячейку(условно 10 и попробовать походить в ячейку 20, ход происходил но он был неправильный
    static boolean checkForRowsAndCols(int knightCell, int knightMove) {
        for (int rows = 0; rows < NUMBERS.length; rows++) {
            for (int cols = 0; cols < NUMBERS.length; cols++) {
                if (knightCell == NUMBERS[rows][cols]) {
                    for (int rows2 = 0; rows2 < NUMBERS.length; rows2++) {
                        for (int cols2 = 0; cols2 < NUMBERS.length; cols2++) {
                            if (knightMove == NUMBERS[rows2][cols2] && rows != rows2
                                    && Math.abs(cols - cols2) < 3) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
