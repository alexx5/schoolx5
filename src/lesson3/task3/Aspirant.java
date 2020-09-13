package lesson3.task3;

public class Aspirant extends Student {

    @Override
    public double getScholarship(double averageMark) {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
