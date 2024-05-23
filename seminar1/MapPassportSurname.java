/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов. */

import java.util.HashMap;
import java.util.Map;

public class MapPassportSurname {
    public static void main(String[] args) {
        Map<Integer, String> passportData = new HashMap<>();
        passportData.put(123456, "Иванов");
        passportData.put(321456, "Васильев");
        passportData.put(234561, "Петрова");
        passportData.put(234432, "Иванов");
        passportData.put(654321, "Петрова");
        passportData.put(345678, "Иванов");
        System.err.println(passportData);
        String searchSurname = "Иванов";

        for (Integer passportNum : passportData.keySet()) {
            String surname = passportData.get(passportNum);
            if (surname.equals(searchSurname)) {
                System.out.printf("Passport number: %d; Surname: %s\n", passportNum, surname);
            }

        }
    }
}
