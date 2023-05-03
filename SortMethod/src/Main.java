import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SortMethod merge = new MergeSort();

        int[] arr = {65, 25, 12, 22, 11};
        boolean sorted = checkIfSorted(arr);

        if (!sorted)
            merge.sort(arr);

        printArray(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }

    private static boolean checkIfSorted(int[] arr) {
        int length = arr.length;

        if (length == 1 || length == 0)
            return true;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }
}

// Write a program to sort the given array - sort method
// Insertion Sort - Iterative Approach