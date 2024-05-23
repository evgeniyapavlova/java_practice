import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа. */

public class ListWIthNumbersAndStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "1", "16", "f", "7", "ggggg"));
        removeIntegersWithIterator(list);
        System.err.println(list);
    }

    public static void removeIntegersWithIterator(ArrayList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String el = iter.next();
            if (isNumber(el)) {
                iter.remove();
            }
        }
    }

    public static void removeIntegers(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s - %b\n", list.get(i), isNumber(list.get(i)));
            if (isNumber(list.get(i))) {
                list.remove(i);
                i--;
            }
        }

    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
