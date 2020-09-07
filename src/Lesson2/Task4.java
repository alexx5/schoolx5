package Lesson2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        System.out.printf("Результат: %d \n", operationsNumber(number) );
        in.close();
    }

    public static int operationsNumber (int num) {
        if (num > 0 ) {
            return ++num;
        } else if (num < 0) {
            return num-2;
        } else {
            num = 10;
            return num;
        }
    }
}
