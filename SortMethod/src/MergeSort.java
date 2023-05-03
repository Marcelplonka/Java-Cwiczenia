public class MergeSort implements SortMethod {

    @Override
    public void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        mergeSort(arr, left, right);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    private void merge (int[] arr, int left, int middle, int right) {
        int leftSubarraySize = middle - left + 1;
        int rightSubarraySize = right - middle;

        int[] leftSubarray = new int[leftSubarraySize];
        int[] rightSubarray = new int[rightSubarraySize];

        System.arraycopy(arr, left, leftSubarray, 0, leftSubarraySize);
        System.arraycopy(arr, middle + 1, rightSubarray, 0, rightSubarraySize);

        int i = 0, j = 0, k = left;
        while (i < leftSubarraySize && j < rightSubarraySize) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                arr[k] = leftSubarray[i];
                i++;
            }
            else {
                arr[k] = rightSubarray[j];
                j++;
            }
            k++;
        }

        while (i < leftSubarraySize) {
            arr[k] = leftSubarray[i];
            i++;
            k++;
        }

        while (j < rightSubarraySize) {
            arr[k] = rightSubarray[j];
            j++;
            k++;
        }
    }
}