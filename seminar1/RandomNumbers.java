import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* Заполнить список десятью случайными числами.
Отсортировать список методом sort() класса Collections и вывести его на
экран. */

public class RandomNumbers {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> list = getRand(size, 50);
        System.err.println(list);
    }

    private static ArrayList<Integer> getRand(int size, int max) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(max));
        }

        Collections.sort(list);
        return list;
    }
}
