import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях -
названия книг. Напишите метод для заполнения данной структуры.*/

public class TwoDimensionalArrayBooks {
    public static void main(String[] args) {
        List<ArrayList<String>> catalogue = new ArrayList<>();
        ArrayList<String> shelf1 = new ArrayList<>(Arrays.asList("Novelle", "book1", "book2", "book3"));
        ArrayList<String> shelf2 = new ArrayList<>(Arrays.asList("Thriller", "book4", "book5", "book6"));
        ArrayList<String> shelf3 = new ArrayList<>(Arrays.asList("Travel", "book7", "book8", "book9"));

        catalogue.add(shelf1);
        catalogue.add(shelf2);
        catalogue.add(shelf3);

        for (ArrayList<String> shelf : catalogue) {
            System.out.println(shelf);
        }
    }
}
