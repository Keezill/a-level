package ua.mamedov.module1;

public class Task2 {
    public static void main(String[] args) {
        Chess.printGameRules();
        int knightCell = Chess.readUserInputKnight();
        Chess.makeUserProgress(knightCell);
        int knightMove = Chess.readUserInputMove(knightCell);
        Chess.makeUserProgress(knightMove);
    }
}
