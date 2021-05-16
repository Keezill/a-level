package ua.mamedov.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0931234567" , "Apple", 344.0);
        Phone phone2 = new Phone("0937654321", "NOKIA");
        Phone phone3 = new Phone();

        System.out.println(phone1.model);
        System.out.println(phone1.getNumber());
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.model);
        System.out.println(phone2.getNumber());
        System.out.println(phone2.weight);
        System.out.println();

        phone3.model = "Xiaomi";
        phone3.number = "0633322211";
        phone3.weight = 444.0;

        System.out.println(phone3.model);
        System.out.println(phone3.getNumber());
        System.out.println(phone3.weight);

        phone1.receiveCall("Дима");
        phone2.receiveCall("Петя");
        phone3.receiveCall("Саша");
    }
}
