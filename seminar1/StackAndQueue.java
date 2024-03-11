package seminar1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди. */
public class StackAndQueue {
    public static void main(String[] args) {
        int[] arr = { 1, 435, 44, 18, 3, 8, 87 };
        Stack<Integer> st = new Stack<>();
        for (Integer elem : arr) {
            st.push(elem);
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        Queue<Integer> que = new LinkedList<>();
        for (Integer elem : arr) {
            que.add(elem);
        }
        System.out.println(que);
    }
}
