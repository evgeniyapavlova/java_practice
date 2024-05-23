import java.util.LinkedList;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка. */
public class InputDataToLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();

        while (true) {
            System.out.println("Input text~num to add an element to list");
            System.out.println("Input print~num to print and remove an element");
            System.out.println("Input exit to exit the program");

            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            String[] strArray = input.split("~");
            String text = strArray[0];
            int num = Integer.parseInt(strArray[1]);

            if (text.equals("print")) {
                if (num >= 0 && num < linkedList.size()) {
                    System.out.println(linkedList.get(num));
                    linkedList.remove(num);
                } else {
                    System.err.println("Wrong index");
                }

            } else {
                if (num >= 0 && num <= linkedList.size()) {
                    linkedList.add(num, text);
                } else {
                    System.err.println("Wrong index");
                }

            }
            System.err.println(linkedList);
        }

        scanner.close();
    }
}
