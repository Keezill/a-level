package ua.mamedov.module1;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 1, 1, 3};
        System.out.println(countUniqueElements(numbers));
    }

    private static int countUniqueElements(int[] numbers) {
        int result;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            countUnique++;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count;
    }
}
