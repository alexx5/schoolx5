package lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.printInfo();
        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();

        SportCar sportCar = new SportCar();

        sportCar.printInfo();
        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();

    }
}
