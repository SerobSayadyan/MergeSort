package mergeSort;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int midSize = arr.length / 2;

        int[] arr1 = new int[midSize];
        int[] arr2 = new int[arr.length - midSize];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        int j = 0;
        for (int i = midSize; i < arr.length; i++) {
            arr2[j++] = arr[i];
        }

        mergeSort(arr1);
        mergeSort(arr2);

        merge(arr, arr1, arr2);

        return arr;
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (left.length > i && right.length > j) {
            if (left[i] <= right[j]) {
                arr[k] = left[i++];
            } else {
                arr[k] = right[j++];
            }
            k++;
        }

        while (left.length > i) {
            arr[k++] = left[i++];
        }

        while (right.length > j) {
            arr[k++] = right[j++];
        }
    }

}
