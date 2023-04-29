public class SelectionSort implements SortMethod {

    @Override
    public void sort(int[] arr) {
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
}
