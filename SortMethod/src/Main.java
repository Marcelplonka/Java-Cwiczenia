import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortMethod bubble = new BubbleSort();

        int[] arr = {65, 25, 12, 22, 11};
        bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Write a program to sort the given array - sort method