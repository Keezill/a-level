package ua.mamedov.hw7;


public class Task2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Dmytro", "Lebedev", "Group1", 4.23);
        students[1] = new Student("Denys", "Denisov", "Group2", 5.0);
        students[2] = new Aspirant("Anton", "Petrov", "Group3", 3.54, "Math");
        students[3] = new Aspirant("Vladimir", "Ivanov", "Group4", 5.0, "Science");

        for (Student student : students) {
            System.out.println(student.firstName + ' ' + student.lastName + " has grant: " + student.getScholarship());
        }
    }
}
