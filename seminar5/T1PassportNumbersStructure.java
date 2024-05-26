package seminar5;

// Написать метод, который переводит число из римского формата записи в арабский.
// Например, MMXXII = 2022
// MMIV = 2004

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class T1PassportNumbersStructure {
    public static void main(String[] args) {
        System.out.println(RomanToArabic("MMIV"));
    }

    static Map<String, Integer> map = new LinkedHashMap<>(Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000));

    public static int RomanToArabic(String str) {

        List<Integer> arabic = new LinkedList<>();

        String[] split = str.split("");

        int res = 0;

        for (int i = 0; i < split.length; i++) {
            arabic.add(map.get(split[i]));
        }

        for (int i = 0; i < arabic.size() - 1; i++) {
            if (arabic.get(i) < arabic.get(i + 1)) {
                res -= arabic.get(i);
            } else {
                res += arabic.get(i);
            }
        }

        res += arabic.get(arabic.size() - 1);

        return res;
    }

    private final String EXCEPTION = "String must contain only valid roman numerals [I, V, X, L, C, D, M].";

    private boolean romanNumberIsValid(String input) {
        /*
         * Кроме валидации конкретных символов, добавил валидацию правильного построения
         * римского числа,
         * например 490 правильно не XD, а CDXC. Текст выброшенного исключения не менял,
         * чтобы прошел валидацию,
         * согласно ТЗ
         */
        return Pattern.matches("[IVXLCDM]+", input);
        // &&
        // !Pattern.matches("I{4,}|X{4,}|C{4,}|M{4,}|V{2,}|L{2,}|D{2,}|IL+|IC+|ID+|IM+|XD+|XM+",
        // input)
    }

    public int toArabic(String romanNotation) {
        if (romanNotation == null) {
            throw new RuntimeException(EXCEPTION);
        }
        // romanNotation = romanNotation.toUpperCase(); если хотим, чтобы можно было
        // вводить и прописные буквы
        int result;
        if (romanNumberIsValid(romanNotation)) {
            result = map.get(Character.toString(romanNotation.charAt(0)));
            List<Integer> symbols = romanNotation
                    .chars().mapToObj(Character::toString)
                    .map(map::get)
                    .collect(Collectors.toList());
            for (int i = 0; i < symbols.size() - 1; i++) {
                if (symbols.get(i) >= symbols.get(i + 1)) {
                    result += symbols.get(i + 1);
                }
                if (symbols.get(i) < symbols.get(i + 1)) {
                    result += symbols.get(i + 1) - symbols.get(i) * 2;
                }
            }
            return result;
        } else {
            throw new RuntimeException("EXCEPTION");
        }
    }
}