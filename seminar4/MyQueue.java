package seminar4;

import java.util.LinkedList;

// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

public class MyQueue<T> {
    private LinkedList<T> ll = new LinkedList<>();

    public void enqueue(T element) {
        ll.addLast(element);
    }

    public T dequeue() {
        T elem = first();
        ll.removeFirst();
        return elem;
    }

    public T first() {
        return ll.getFirst();
    }

    public LinkedList<T> getElements() {
        return ll;
    }
}
