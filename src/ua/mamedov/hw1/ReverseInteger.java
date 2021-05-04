package ua.mamedov.hw1;

public class ReverseInteger {
    public static void main(String[] args) {
        var number = 123456;

        var result = 0;
        var temp = number;
        while(temp != 0){
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse number: " + result);
    }
}
