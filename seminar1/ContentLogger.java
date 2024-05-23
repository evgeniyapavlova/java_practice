import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл. */

public class ContentLogger {
    private static Logger logger = Logger.getLogger(ContentLogger.class.getName());

    public static void main(String[] args) {
        configureLogger();
        String[] folderContent = getFolderContent("./seminar1");
        writeToFile(folderContent, "test1.txt");
    }

    public static String[] getFolderContent(String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeToFile(String[] strs, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {

            for (String str : strs) {
                fw.write(str);
                fw.write(System.lineSeparator());
            }

            logger.log(Level.INFO, "Данные успешно записаны в файл");
        } catch (Exception e) {
            logger.warning("Ошибка записи в файл");

        }
    }

    public static void configureLogger() {
        try {
            FileHandler fh = new FileHandler("log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
