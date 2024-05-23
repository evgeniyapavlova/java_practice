package seminar3;

import java.util.ArrayList;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class S3L2RemoveIntFromList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add("string");
        list.add("hello");
        list.add(10);
        // list.add(1001);
        list.add(40);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(list.get(i--));

            }
        }

        System.out.println(list);

    }
}
