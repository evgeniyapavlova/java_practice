package seminar1;

import java.util.LinkedList;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти. */
public class InputAndSaveStringsToList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Input a string to add to the list");
            System.out.println("Input \"print\" to print reverted list");
            System.out.println("Input \"revert\" to delete the last string");
            System.out.println("Input \"exit\" to exit the program");

            String input = scan.nextLine();

            if (input.equals("exit"))
                break;
            if (input.equals("print")) {
                for (int index = linkedList.size() - 1; index >= 0; index--) {
                    System.out.printf("%s ", linkedList.get(index));
                }
                System.out.println();
            } else if (input.equals("revert")) {
                if (!linkedList.isEmpty()) linkedList.removeLast();
            } else {
                linkedList.add(input);
            }

            System.out.println(linkedList);

        }

        scan.close();
    }
}
