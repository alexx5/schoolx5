package lesson2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        System.out.printf("Результат: %d \n", increaseNumber(number) );
        in.close();
    }

    public static int increaseNumber (int num) {
        if (num >= 0 ) {
            return ++num;
        } else {
            return num;
        }
    }
}
