package lesson2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        System.out.println("Результат: " + descriptionNumber(number));
        in.close();
    }

    public static String descriptionNumber (int num) {
        if (num > 0 && num%2 == 0) {
            return "Положительное четное число";
        } else if (num > 0 && num%2 != 0) {
            return "Положительное нечетное число";
        } else if (num < 0 && num%2 == 0) {
            return "Отрицательное четное число";
        } else if (num < 0 && num%2 != 0) {
            return "Отрицательное нечетное число";
        } else {
            return "Нулевое число";
        }
    }
}
