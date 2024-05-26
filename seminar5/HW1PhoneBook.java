package seminar5;

import java.util.ArrayList;
import java.util.HashMap;

// Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:

// add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
// Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
// Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.

// find(String name): Поиск номеров телефона по имени в телефонной книге.
// Если запись с именем name существует, возвращает список номеров телефона для этой записи.
// Если запись с именем name не существует, возвращает пустой список.

// getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.

public class HW1PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void add(String name, Integer phoneNum) {
        ArrayList<Integer> value = phoneBook.get(name);
        ArrayList<Integer> temp = new ArrayList<>();

        if (value != null && value.size() != 0) {
            temp = phoneBook.get(name);
        }

        temp.add(phoneNum);
        phoneBook.put(name, temp);
    }

    public static ArrayList<Integer> find(String name) {
        ArrayList<Integer> value = phoneBook.get(name);
        if (value == null) {
            return new ArrayList<>();
        }
        return value;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        add("Alice", 123456);
        add("Alice", 789012);
        add("Bob", 789012);
        System.out.println(find("Alice"));
        System.out.println(getPhoneBook());
        System.out.println(find("Me"));
        System.out.println(phoneBook);
    }
}
