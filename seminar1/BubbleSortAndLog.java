import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSortAndLog {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int[] arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };

        sort(arr);

    }

    public static void sort(int[] mas) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        log = new File("log.txt");

        if (!log.exists()) {
            try {
                log.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter clearWriter = new FileWriter(log, false);
            clearWriter.write("");
            clearWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Boolean hideLastRows = false;
        if (mas[0] == 9) {
            hideLastRows = true;
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
            if (!(hideLastRows && (i == 8 || i == 9))) {
                try {

                    fileWriter = new FileWriter(log, true);
                    String formattedDate = dateFormat.format(new Date());
                    fileWriter.write(
                            formattedDate + " " + Arrays.toString(mas) + "\n");
                    fileWriter.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
