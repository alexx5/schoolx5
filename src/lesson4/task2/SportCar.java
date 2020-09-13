package lesson4.task2;

public class SportCar extends Car {

    int maxSpeed;

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(this.brand);
        System.out.println(this.classCar);
        System.out.println(this.weight);
        System.out.println(this.motor);
        System.out.println(this.power);
        System.out.println(this.manufacturer);
        System.out.println(this.maxSpeed);
    }
}
