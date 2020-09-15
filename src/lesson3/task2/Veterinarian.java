package lesson3.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {

        System.out.println(animal.food + " " + animal.location);
    }

    public static void main(String[] args) {
        Animal[] arrayAnimals = new Animal[3];

        Animal vasya = new Cat();
        Animal kolya = new Dog();
        Animal petya = new Horse();

        vasya.food = "milk";
        vasya.location = "Moscow";

        kolya.food = "meat";
        kolya.location = "Tokyo";

        petya.food = "herb";
        petya.location = "Monaco";

        arrayAnimals[0] = vasya;
        arrayAnimals[1] = kolya;
        arrayAnimals[2] = petya;

        Veterinarian doc = new Veterinarian();

        for (int i = 0; i < arrayAnimals.length; i++) {
            doc.treatAnimal(arrayAnimals[i]);
        }

    }

}
