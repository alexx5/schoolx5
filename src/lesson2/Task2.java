package lesson2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое, трехзначное число: ");
        int number = in.nextInt();
        System.out.printf("Сумма цифр: %d \n", sumDigits(number) );
        in.close();
    }

    public static int sumDigits (int num) {
        int firstDigit = num / 100;
        int secondDigit = (num - firstDigit * 100) / 10;
        int thirdDigit = num - firstDigit * 100 - secondDigit * 10;
        return firstDigit + secondDigit + thirdDigit;
    }
}
