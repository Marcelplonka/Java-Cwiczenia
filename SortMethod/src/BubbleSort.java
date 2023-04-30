public class BubbleSort implements SortMethod {

    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        boolean swapped;

        for (int i = 0; i < length - 1; i++) {

            swapped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
