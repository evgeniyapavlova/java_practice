/* Дан LinkedList с несколькими элементами разного типа. 
В методе revert класса LLTasks реализуйте разворот этого списка без использования встроенного функционала. */

import java.util.LinkedList;

public class RevertedLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);

        System.out.println(revert(ll));
    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // LinkedList<Object> llTemp = new LinkedList<>();
        // while (!ll.isEmpty()) {
        // llTemp.add(ll.pollLast());
        // }
        // return llTemp;

        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - i - 1));
            ll.set(size - i - 1, temp);
        }
        return ll;
    }
}
