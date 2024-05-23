package seminar4;
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TimeAddToArrayListAndLinkedList {
    private static int LENGTH = 10000000;

    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        // ArrayList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intArrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        double result = endTime - startTime;
        System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

        // LinkedList
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intLinkedList.add(i);
        }
        long endTime2 = System.currentTimeMillis();
        double result2 = endTime2 - startTime2;
        System.out.printf("Run time for LinkedList: %s %s %n", result2, "ms");

        // Add to the middle of the list

        // ArrayList
        long startTime3 = System.currentTimeMillis();

        int count = 0;
        Random random = new Random();
        while (count != 10000) {
            intLinkedList.add(4000, random.nextInt());
            count += 2;
        }
        long endTime3 = System.currentTimeMillis();
        System.out.printf("Run time for ArrayList: %s %s %n", endTime3 - startTime3, "ms");

        // LinkedList
        long startTime4 = System.currentTimeMillis();
        count = 0;
        while (count != 1000) {
            intLinkedList.add(4000, random.nextInt());
            count += 2;
        }
        long endTime4 = System.currentTimeMillis();
        System.out.printf("Run time for LinkedList: %s %s %n", endTime4 - startTime4, "ms");
    }
}
