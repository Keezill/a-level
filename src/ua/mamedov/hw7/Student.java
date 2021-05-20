package ua.mamedov.hw7;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }


    int getScholarship() {
        if (averageMark == 5) {
            return 100;
        }
        return 80;
    }
}
