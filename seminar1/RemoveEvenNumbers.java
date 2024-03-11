package seminar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        System.out.println(removeEvenNumbers(arr));
    }

    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            Integer el = iter.next();
            if (el % 2 == 0)
                iter.remove();
        }
        return list;

    }
}
