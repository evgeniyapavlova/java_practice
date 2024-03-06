// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
// ababababab

package seminar1;

public class AlternatingChars {
    public static void main(String[] args) {
        int n = 10;
        char c1 = 'a';
        char c2 = 'b';

        System.err.println(getAlternatingCharsString(n, c1, c2));

    }

    public static String getAlternatingCharsString(int n, char c1, char c2) {
        String str = "";

        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

        return str;
    }
}
