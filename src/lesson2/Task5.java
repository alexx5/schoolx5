package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<Integer>();

        for (int i = 1; i < 4; i++) {
            System.out.print("Введите целое число № " + i + ": ");
            list.add(sc.next());
        }

        System.out.println("Наименьшее число: " + Collections.min(list));
        sc.close();
    }
}