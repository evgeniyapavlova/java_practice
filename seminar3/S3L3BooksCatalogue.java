package seminar3;

import java.util.ArrayList;
import java.util.List;

// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

public class S3L3BooksCatalogue {
    static List<ArrayList<String>> books = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<String> proza = new ArrayList<>(List.of("proza", "War and Peace", "Master and Margarita"));

        ArrayList<String> poezia = new ArrayList<>(List.of("poezia", "Borodino", "Evgeny Onegin"));

        ArrayList<String> skazki = new ArrayList<>(List.of("skazki", "Masha and Bears", "Red hat"));

        System.out.println(proza);
        System.out.println(poezia);
        System.out.println(skazki);

        books.addAll(List.of(proza, poezia, skazki));

        System.out.println(books);
    }
}
