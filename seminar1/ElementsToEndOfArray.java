package seminar1;

import java.util.Arrays;

// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

public class ElementsToEndOfArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 3, 3, 10, 234, 3, 2, 2, 3 };
        int val = 3;
        moveToEndElem(arr, val);
    } 

    private static void moveToEndElem(int[] arr, int val) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (arr[rightIndex] == val) {
            rightIndex--;
        }

        while (leftIndex < rightIndex) {
            if (arr[leftIndex] == val) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                rightIndex--;
            }
            leftIndex++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
