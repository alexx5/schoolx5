package lesson3.task3;

public class Main {

    public static void main(String[] args) {
        Student petya = new Aspirant();

        Student[] people = new Student[4];

        Student kolya = new Student();
        Student gosha = new Student();
        Aspirant vasya = new Aspirant();
        Aspirant tanya = new Aspirant();

        kolya.averageMark = 5;
        gosha.averageMark = 4;
        vasya.averageMark = 5;
        tanya.averageMark = 4;


        people[0] = kolya;
        people[1] = gosha;
        people[2] = vasya;
        people[3] = tanya;

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getScholarship(people[i].averageMark));
        }
    }
}
