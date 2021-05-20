package ua.mamedov.hw7;

public class Aspirant extends Student {
    protected String work;

    Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }


    @Override
    int getScholarship() {
        if (averageMark == 5) {
            return 200;
        }
        return 180;
    }
}
