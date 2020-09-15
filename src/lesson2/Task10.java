package lesson2;

public class Task10 {

    public static void main(String[] args) {
        int arr[] = {15, 10, 51, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int length = arr.length;
        moveZerosToEnd(arr, length);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void moveZerosToEnd(int arr[], int len) {
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < len) {
            arr[count++] = 0;
        }
    }
}