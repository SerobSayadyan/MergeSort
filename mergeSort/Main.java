package mergeSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var m = new MergeSort();

        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        int[] res = m.mergeSort(arr);

        for ( int i : res) {
            System.out.println(i);
        }
    }
}
