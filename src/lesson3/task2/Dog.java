package lesson3.task2;

public class Dog extends Animal {

    String breed;

    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("Собака спит");
    }
}
