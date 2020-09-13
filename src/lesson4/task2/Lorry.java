package lesson4.task2;

public class Lorry extends Car {

    int liftingCapacity;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(this.brand);
        System.out.println(this.classCar);
        System.out.println(this.weight);
        System.out.println(this.motor);
        System.out.println(this.power);
        System.out.println(this.manufacturer);
        System.out.println(this.liftingCapacity);
    }
}
