package lesson2;

public class Task9 {

    public static void main(String[] args) {
        int[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        showArray(revertArray(array));
    }

    public static int[] revertArray(int[] arr) {
        int[] myArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            myArr[j] = arr[i];
        }
        return myArr;
    }

    public static void showArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

}
