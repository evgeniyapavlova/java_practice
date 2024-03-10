package seminar1;

import java.util.ArrayList;
import java.util.Collections;

/* Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
Пройти по списку и удалить повторяющиеся элементы. */

public class Planets {
    public static void main(String[] args) {
        ArrayList<String> planets = getListPlanets();
        System.out.println(planets);

        printElemsAndRepeatings(planets);
        removerepeatingElems(planets);
        System.out.println(planets);
    }

    private static void removerepeatingElems(ArrayList<String> list) {
        // for (int i = 0; i < list.size(); i++) {
        // String currentPlanet = list.get(i);
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(j).equals(currentPlanet)) {
        // list.remove(j);
        // j--;
        // }
        // }
        // }

        for (int i = 0; i < list.size(); i++) {
            String currentPlanet = list.get(i);
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(currentPlanet)) {
                    list.remove(j);
                }
            }
        }
    }

    private static void printElemsAndRepeatings(ArrayList<String> list) {
        ArrayList<String> tempSortedPlanets = new ArrayList<>(list);

        Collections.sort(tempSortedPlanets);

        int count = 1;
        String currentPlanet = tempSortedPlanets.get(0);

        for (int i = 1; i < tempSortedPlanets.size(); i++) {
            if (tempSortedPlanets.get(i).equals(currentPlanet)) {
                count++;
            } else {
                System.out.printf("%d - %s\n", count, currentPlanet);
                count = 1;
                currentPlanet = tempSortedPlanets.get(i);
            }
        }

        System.out.printf("%d - %s\n", count, currentPlanet);

    }

    private static ArrayList<String> getListPlanets() {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uran");
        planets.add("Neptune");
        planets.add("Jupiter");
        planets.add("Jupiter");
        planets.add("Mars");
        planets.add("Venera");
        planets.add("Venera");
        planets.add("Venera");

        return planets;
    }
}
