package seminar1;

import java.io.FileWriter;

/* Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
который запишет эту строку в простой текстовый файл, обработайте исключения. */

public class WriteStringToFile {
    public static void main(String[] args) {
        String str = makeRepeatingString("TEST", 100);
        writeToFile(str, "test.txt");
    }

    public static String makeRepeatingString(String word, int repeat) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(str);
            System.err.println("Данные успешно записаны в файл");
        } catch (Exception e) {
            System.err.println("Ошибка записи в файл");
        }
    }
}
