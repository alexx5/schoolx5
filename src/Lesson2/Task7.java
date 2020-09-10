package Lesson2;

import java.util.Scanner;

public class Task7 {

    private static final int TALK_TIME = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        System.out.println("Результат: " + callCost(number));
        in.close();
    }

    public static String callCost (int num) {
        if (num == 905) {
            return "Москва. Стоимость разговора: " + 4.15 * TALK_TIME + " руб." ;
        } else if (num == 194) {
            return "Ростов. Стоимость разговора: " + 1.98 * TALK_TIME + " руб." ;
        } else if (num == 491) {
            return "Краснодар. Стоимость разговора: " + 2.69 * TALK_TIME + " руб." ;
        } else if (num == 800) {
            return "Киров. Стоимость разговора: " + 5.00 * TALK_TIME + " руб." ;
        } else {
            return "Вы ввели неверный код города";
        }
    }
}
