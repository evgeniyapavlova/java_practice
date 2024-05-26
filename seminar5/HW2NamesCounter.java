package seminar5;

import java.util.HashMap;

// Вы работаете с приложением для учета имен пользователей. 
// Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
// Программа должна использовать HashMap для хранения имен и их количества вхождений.
// По завершении, программа выводит результат в виде пар "имя - количество".

public class HW2NamesCounter {
    private static HashMap<String, Integer> names = new HashMap<>();

    public static void addName(String name) {
        Integer value = names.get(name);
        if (value != null) {
            value++;
        } else {
            value = 1;
        }

        names.put(name, value);

    }

    public static void showNamesOccurrences() {
        System.out.println(names);
    }

    public static void main(String[] args) {
        addName("Elena");
        addName("Elena");
        addName("Elena");
        addName("Ivan");
        addName("Ivan");
        showNamesOccurrences();
    }
}
