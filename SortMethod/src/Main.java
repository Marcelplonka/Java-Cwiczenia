import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {65, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int key = arr[min_idx];
            while (min_idx > i) {
                arr[min_idx] = arr[min_idx - 1];
                min_idx--;
            }

            arr[i] = key;
        }
    }
    private static void bubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

// Write a program to sort the given array - sort method