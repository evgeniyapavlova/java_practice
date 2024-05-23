/* Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение). */

public class Palindrom {
    public static void main(String[] args) {
        String str = "abababbab8aba";
        System.out.println(isPalindrom(str));

    }

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }

        return true;
    }
}
