package lesson4.task2;

public abstract class Car extends Engine {
    String brand;
    String classCar;
    String weight;
    Engine motor;

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Повотор направо");
    }

    public void turnLeft() {
        System.out.println("Повотор налево");
    }


}
