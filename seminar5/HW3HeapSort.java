package seminar5;

import java.util.Arrays;

// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:

// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.

// Сначала выводить исходный массив на экран.

// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.

// Выводить отсортированный массив на экран.

// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.

// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

public class HW3HeapSort {
    public static void buildTree(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapSort(int[] arr, int n) {
        buildTree(arr);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    // Метод для демонстрации работы сортировки
    public static void main(String[] args) {
        HW3HeapSort sorter = new HW3HeapSort();
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Исходный массив:");
        printArray(arr);

        heapSort(arr, arr.length);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }

    // Метод для вывода массива на экран
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
