package lesson3.task1;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
        //this.number = number;
        //this.model = model;
    }


    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall (String name, String phone) {
        System.out.println("Звонит " + name + " " + phone);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage (String ... numbers) {
        System.out.println("Число аргументов: " + numbers.length);
        System.out.println("Содержимое: ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(" arg " + i + ": " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        Phone one = new Phone();
        Phone two = new Phone();
        Phone three = new Phone();

        System.out.println(one.number);
        System.out.println(two.model);
        System.out.println(one.weight);

        one.getNumber();
        two.receiveCall("Petya");
        three.receiveCall("Petya", "89059059595");

        one.sendMessage("89059052233", "89009002233");
    }
}