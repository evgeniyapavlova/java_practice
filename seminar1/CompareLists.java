package seminar1;

import java.util.ArrayList;
import java.util.LinkedList;

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
    Сравните с предыдущим
*/
public class CompareLists {
    public static void main(String[] args) {
        int count = 200000;

        long start = System.currentTimeMillis();
        addToEndArrayList(count);
        System.out.printf("Добавление в конец ArrayList - %d\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        addToEndLinkedList(count);
        System.out.printf("Добавление в конец LinkedList - %d\n", System.currentTimeMillis() - start);

        System.out.println();

        start = System.currentTimeMillis();
        addToStartArrayList(count);
        System.out.printf("Добавление в начало ArrayList - %d\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        addToStartLinkedList(count);
        System.out.printf("Добавление в начало LinkedList - %d\n", System.currentTimeMillis() - start);

        System.out.println();

        start = System.currentTimeMillis();
        addToMiddleArrayList(count);
        System.out.printf("Добавление в середину ArrayList - %d\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        addToMiddleLinkedList(count);
        System.out.printf("Добавление в середину LinkedList - %d\n", System.currentTimeMillis() - start);
    }

    public static ArrayList<Integer> addToEndArrayList(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static ArrayList<Integer> addToStartArrayList(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }

    public static ArrayList<Integer> addToMiddleArrayList(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> addToEndLinkedList(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static LinkedList<Integer> addToStartLinkedList(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }

    public static LinkedList<Integer> addToMiddleLinkedList(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        return linkedList;
    }

}
