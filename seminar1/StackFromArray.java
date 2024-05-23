/*Реализовать стэк с помощью массива.
Нужно реализовать методы: size(), empty(), push(), peek(), pop(). */

public class StackFromArray {
    private static int[] arr;
    private static int size;
    private static int topIndex;

    public static void main(String[] args) {
        size = 10;
        arr = new int[size];
        topIndex = -1;

        System.out.println(size());
        System.out.println(empty());

        push(123);
        push(332);
        push(1);
        push(65);
        push(87);

        System.out.println(size());
        System.out.println(empty());
        System.out.println(pop());
        System.out.println(size());
    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int el) {
        arr[++topIndex] = el;
    }

    public static int peek(int el) {
        return arr[topIndex];
    }

    public static int pop() {
        return arr[topIndex--];
    }
}
