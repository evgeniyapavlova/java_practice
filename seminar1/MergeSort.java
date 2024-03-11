package seminar1;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 1, 6, 2, 3, 4 };

        String itresume_res = Arrays.toString(mergeSort(a));
        System.out.println(itresume_res);
    }

    private static void merge(int[] arr, int left, int middle, int right) {        
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static int[] mergeSort(int[] a) {
        sort(a, 0, a.length - 1);
        return a;
    }
}
