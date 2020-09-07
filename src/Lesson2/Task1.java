package Lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        System.out.printf("Последняя цифра: %d \n", number%10);

        in.close();

    }
}
