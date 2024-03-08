// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
// ababababab

package seminar1;

public class AlternatingChars {
    public static void main(String[] args) {
        int n = 10000;
        char c1 = 'a';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        getAlternatingCharsString(n, c1, c2);
        long end = System.currentTimeMillis();
        System.err.println(end - start);

        start = System.currentTimeMillis();
        getAlternatingCharsString2(n, c1, c2);
        end = System.currentTimeMillis();
        System.err.println(end - start);

    }

    public static String getAlternatingCharsString(int n, char c1, char c2) {
        String str = "";

        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

        return str;
    }

    public static String getAlternatingCharsString2(int n, char c1, char c2) {
        // use StrringBuilder
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }

        return sb.toString();
    }
}
