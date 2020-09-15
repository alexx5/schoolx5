package lesson3.task3;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public double getScholarship(double averageMark) {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

}
